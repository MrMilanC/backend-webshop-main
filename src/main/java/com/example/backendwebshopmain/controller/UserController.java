package com.example.backendwebshopmain.controller;

import com.example.backendwebshopmain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backendwebshopmain.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired //erstellt automatisch Repository
    private UserRepository userRepo;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        userRepo.save(user);
        return user;
    }

    @GetMapping("/get")
    public List<User> getAllCategories () {
        return userRepo.findAll();
    }
}

