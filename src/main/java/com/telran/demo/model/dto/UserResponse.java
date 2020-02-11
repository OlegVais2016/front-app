package com.telran.demo.model.dto;

import com.telran.demo.model.entity.User;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UserResponse {

    private String userId;
    private String firstName;
    private String lastName;
    private Integer age;

    public UserResponse(User user) {
        this.userId = user.getUserId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.age = user.getAge();
    }
}
