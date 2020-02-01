package com.telran.demo.controller;

import com.telran.demo.model.entity.Event;
import com.telran.demo.model.entity.User;
import com.telran.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventRepository eventRepository;
    @PostMapping("/events")
    public Event create(@RequestBody Event event){
        return eventRepository.save(event);
    }

}
