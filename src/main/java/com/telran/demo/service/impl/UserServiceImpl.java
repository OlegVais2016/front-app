package com.telran.demo.service.impl;

import com.telran.demo.model.dto.UserRequest;
import com.telran.demo.model.dto.UserResponse;
import com.telran.demo.model.entity.User;
import com.telran.demo.repository.UserRepository;
import com.telran.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse save(UserRequest userRequest) {
        User user = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .age(userRequest.getAge())
                .build();
        userRepository.save(user);
        return UserResponse.builder()
                .userId(user.getUserId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .build();
    }

    @Override
    public void deleteById(String userId) {
        userRepository.deleteById(userId);
    }
}
