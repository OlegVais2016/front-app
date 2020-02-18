package com.telran.demo.controller;

import com.telran.demo.model.dto.EventRequest;
import com.telran.demo.model.dto.EventResponse;
import com.telran.demo.model.entity.Event;
import com.telran.demo.model.entity.User;
import com.telran.demo.repository.EventRepository;
import com.telran.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/events/{userId}")
    public EventResponse create(@RequestBody EventRequest eventRequest,
                                @PathVariable String userId){
        return eventService.save(eventRequest,userId);
    }

    @DeleteMapping("/events/del/{userId}/{eventId}")
    public String deleteEvent(@PathVariable String userId,
                              @PathVariable String eventId){
        eventService.deleteEvent(userId,eventId);
        return "Event deleted";
    }

    @PostMapping("/events/{userId}/{eventId}")
    public String submitToEvent(@PathVariable String userId,
                                @PathVariable String eventId){
        eventService.submitToEvent(userId,eventId);
        return "You are submitted";
    }
}
