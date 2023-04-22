package com.example.REST.Services;

import com.example.REST.eventsAndSchedule.NewCustomerEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventServicePublisher {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void addCustomer(NewCustomerEvent events) {
        // do some tasks here
        NewCustomerEvent event = new NewCustomerEvent(events,"User added");
        publisher.publishEvent(event);
    }
}
