package com.myshop.store.cart.service;

import com.myshop.store.cart.entity.User;
import com.myshop.store.cart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }
    public java.util.List<User> getAllUsers() {
        return userRepository.findAll();
    }
}