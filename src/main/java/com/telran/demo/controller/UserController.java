package com.telran.demo.controller;

import com.telran.demo.model.entity.User;
import com.telran.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }


    //users/:id
    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") String id) {
        return userRepository.findById(id).orElse(null);
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
