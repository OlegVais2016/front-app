package com.telran.demo.model.dto;

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

}
