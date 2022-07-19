package com.example.project.service;

import com.example.project.entity.User;

public interface UserService {
    User findUserByUserName(String userName);
    User saveUser(User user);
}
