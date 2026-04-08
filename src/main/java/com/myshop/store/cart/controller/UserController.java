package com.myshop.store.cart.controller;

import com.myshop.store.cart.entity.User;
import com.myshop.store.cart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ Create User API
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // ✅ Get All Users API
    @GetMapping
    public java.util.List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}