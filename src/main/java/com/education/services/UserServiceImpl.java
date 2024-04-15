package com.education.services;

import com.education.models.User;
import com.education.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isValidUser(String username, String password) {
        try {
            User user = userRepository.findByUsernameAndPassword(username, password);
            return user != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
