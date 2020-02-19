package com.spring.dao;

import com.spring.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void deletUser(Long id);

    User getUserById(Long id);

    User getUserByName(String name);

    List<User> getAllUsers();
}
