package com.telran.demo.model.dto;

import com.telran.demo.model.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class EventRequest {

    private String city;
    private String street;
    private String house;

}
