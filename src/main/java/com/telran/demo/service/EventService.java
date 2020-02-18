package com.telran.demo.service;

import com.telran.demo.model.dto.EventRequest;
import com.telran.demo.model.dto.EventResponse;

public interface EventService {

    EventResponse save(EventRequest eventRequest, String userId);
    void deleteEvent(String userId, String eventId);
    void submitToEvent(String userId, String eventId);
}
