package com.telran.demo.service;

import com.telran.demo.model.dto.UserRequest;
import com.telran.demo.model.dto.UserResponse;

public interface UserService {

    UserResponse save(UserRequest userRequest);
    void deleteById(String userId);
}
