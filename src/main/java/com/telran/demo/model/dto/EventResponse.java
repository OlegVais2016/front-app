package com.telran.demo.model.dto;

import com.telran.demo.model.entity.User;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class EventResponse {

    private String id;
    private String city;
    private String street;
    private String house;
    private User arranger;
    private List<User> participants;

}
