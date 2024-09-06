package org.joann.usermanagement.servicies;

import org.joann.usermanagement.DTO.UserRegistrationDto;
import org.joann.usermanagement.models.Role;
import org.joann.usermanagement.models.User;
import org.joann.usermanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User register(UserRegistrationDto userDto) {
        // Step 1: Validate that the username is not already in use
        if (userRepository.findByUsername(userDto.getUsername()).isPresent()) {
            throw new IllegalArgumentException("Username already in use");
        }

        // Step 2: Create a new User entity from the DTO
        User newUser = new User();
        newUser.setUsername(userDto.getUsername());
        newUser.setEmail(userDto.getEmail());

        // Step 3: Encrypt the user's password
        String encodedPassword = passwordEncoder.encode(userDto.getPassword());
        newUser.setPassword(encodedPassword);

        // Step 4: Set the user's role (e.g., default role as USER)
        newUser.setRole(Role.USER);  // Assuming `Role.USER` is a valid role

        // Step 5: Save the user to the database
        User savedUser = userRepository.save(newUser);

        // Step 6: Return the saved user (or transform it to a DTO if needed)
        return savedUser;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return List.of();
    }

    @Override
    public User updateUser(Long id, UserRegistrationDto dto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

//    @Override
//    public User register(UserRegistrationDto dto) {
//        return null;
//    }

}

