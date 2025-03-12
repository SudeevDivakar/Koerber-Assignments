package com.bookapp.service;

import com.bookapp.model.User;

public interface UserService {
    User findByUsername(String username);
    void addUserEntity(User userEntity);
}