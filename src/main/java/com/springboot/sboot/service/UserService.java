package com.springboot.sboot.service;


import com.springboot.sboot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUserById(Long id);
    void updateUser(User user);
    Object getUser(Long id);
    List<User> getAllUsers();
}
