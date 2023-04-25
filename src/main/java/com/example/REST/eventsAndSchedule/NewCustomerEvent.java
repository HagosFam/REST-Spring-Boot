package com.example.REST.eventsAndSchedule;

import org.springframework.context.ApplicationEvent;

public class NewCustomerEvent {
    private String message;

    public NewCustomerEvent( String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }
}
