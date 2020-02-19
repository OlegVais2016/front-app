package com.telran.demo.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@Document(collection = "users")
public class User {

    @Id
    private String userId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String telNumber;
    private Integer age;

}
