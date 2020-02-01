package com.telran.demo.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@Document(collection = "events")
public class Event {

    @Id
    private String id;
    private String city;
    private String street;
    private Integer house;
    private User arranger;
    private List<User> participants;

}
