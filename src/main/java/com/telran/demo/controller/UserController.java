package com.telran.demo.controller;

import com.telran.demo.model.dto.UserRequest;
import com.telran.demo.model.dto.UserResponse;
import com.telran.demo.model.entity.User;
import com.telran.demo.repository.UserRepository;
import com.telran.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public UserResponse add(@RequestBody UserRequest userRequest) {
        return userService.save(userRequest);
    }
    @PostMapping("/users/{userId}")
    public void delete(@PathVariable String userId){
        userService.deleteById(userId);
    }
/*
    //users/:id
    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userRepository.findAll();
    }*/
}
