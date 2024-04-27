package com.user.service;

import java.util.List;

import com.user.model.User;
import com.user.model.responce.UserResponce;

public interface UserService {

	UserResponce createUser(User user);

    User getUserById(String userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(String userId);
    
}
