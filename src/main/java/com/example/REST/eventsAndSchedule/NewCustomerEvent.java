package com.example.REST.eventsAndSchedule;

import org.springframework.context.ApplicationEvent;

public class NewCustomerEvent extends ApplicationEvent {
    private String message;

    public NewCustomerEvent(Object source, String msg) {
        super(source);
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }
}
