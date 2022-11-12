package com.demo.swagger.service;

import com.demo.swagger.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    List<User> getAllUsers();
}
