package com.bookapp.service;

import com.bookapp.model.User;
import com.bookapp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void addUserEntity(User userEntity) {
        userRepository.save(userEntity);
    }
}