package com.telran.demo.service.impl;

import com.telran.demo.exeptions.EventNotFoundException;
import com.telran.demo.exeptions.UserNotFoundException;
import com.telran.demo.model.dto.EventRequest;
import com.telran.demo.model.dto.EventResponse;
import com.telran.demo.model.entity.Event;
import com.telran.demo.model.entity.User;
import com.telran.demo.repository.EventRepository;
import com.telran.demo.repository.UserRepository;
import com.telran.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;
    @Override
    public EventResponse save(EventRequest eventRequest,  String userId) {

        User arranger = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        Event event = Event.builder()
                .arranger(arranger)
                .city(eventRequest.getCity())
                .street(eventRequest.getStreet())
                .house(eventRequest.getHouse())
                .build();

        eventRepository.save(event);
        return EventResponse.builder()
                .id(event.getId())
                .arranger(event.getArranger())
                .city(event.getCity())
                .street(event.getStreet())
                .house(event.getHouse())
                .build();
    }

    @Override
    public void submitToEvent(String userId, String eventId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new EventNotFoundException(eventId));
        List<User> users = event.getParticipants();
        if(users.isEmpty()){
            List<User> userList = new ArrayList<>();
            userList.add(user);
            Event addFirst = Event.builder()
                    .id(event.getId())
                    .arranger(event.getArranger())
                    .city(event.getCity())
                    .street(event.getStreet())
                    .house(event.getHouse())
                    .participants(userList)
                    .build();
            eventRepository.save(addFirst);
        } if(!users.isEmpty()) {
            users.add(user);
            Event addOthers = Event.builder()
                    .id(event.getId())
                    .arranger(event.getArranger())
                    .city(event.getCity())
                    .street(event.getStreet())
                    .house(event.getHouse())
                    .participants(users)
                    .build();
            eventRepository.save(addOthers);
        }

    }
}
