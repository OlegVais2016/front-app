package com.telran.demo.service;

import com.telran.demo.model.dto.UserRequest;
import com.telran.demo.model.dto.UserResponse;


import java.util.List;

public interface UserService {

    UserResponse save(UserRequest userRequest);
    void deleteById(String userId);
    UserResponse findById(String userId);
    List<UserResponse> findAll();
}
