package org.joann.usermanagement.servicies;

import org.joann.usermanagement.DTO.UserRegistrationDto;
import org.joann.usermanagement.models.User;

import java.util.List;

public interface UserService {
    User register(UserRegistrationDto dto);
    User findUserById(Long id);
    List<User> findAllUsers();
    User updateUser(Long id, UserRegistrationDto dto);
    void deleteUser(Long id);
}

