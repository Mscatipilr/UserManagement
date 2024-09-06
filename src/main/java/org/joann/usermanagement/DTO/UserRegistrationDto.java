package org.joann.usermanagement.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegistrationDto {
    @NotBlank
    @Size(min = 4, max = 20)
    private String username;

    @NotBlank
    @Size(min = 8)
    @ValidPassword  // Custom annotation for password strength validation
    private String password;

    @Email
    @NotBlank
    private String email;

    // Getters and Setters

    public @NotBlank @Size(min = 4, max = 20) String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank @Size(min = 4, max = 20) String username) {
        this.username = username;
    }

    public @NotBlank @Size(min = 8) String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank @Size(min = 8) String password) {
        this.password = password;
    }

    public @Email @NotBlank String getEmail() {
        return email;
    }

    public void setEmail(@Email @NotBlank String email) {
        this.email = email;
    }
}
