package com.telran.demo.exeptions;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends BaseException{

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }

    public UserNotFoundException(String eventId) {
        super(String.format("Event with ID [%d] not found", eventId));
    }
}
