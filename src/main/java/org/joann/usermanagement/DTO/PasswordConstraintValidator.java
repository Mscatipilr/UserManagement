package org.joann.usermanagement.DTO;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {
    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) {
            return false;  // Password should not be null
        }

        // Regular expression for a strong password
        String passwordPattern = "^(?=.*[0-9])"     // At least one digit
                + "(?=.*[a-z])"      // At least one lowercase letter
                + "(?=.*[A-Z])"      // At least one uppercase letter
                + "(?=.*[@#$%^&+=])" // At least one special character
                + "(?=\\S+$)"        // No whitespace allowed
                + ".{8,}$";          // At least 8 characters

        return password.matches(passwordPattern);
    }
}
