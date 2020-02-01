package com.telran.demo.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UserRequest {
    private String firstName;
    private String lastName;
    private Integer age;
}
