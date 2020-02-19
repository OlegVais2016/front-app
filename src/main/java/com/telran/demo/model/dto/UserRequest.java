package com.telran.demo.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UserRequest {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String telNumber;
    private Integer age;

}
