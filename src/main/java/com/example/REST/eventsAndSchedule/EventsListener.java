package com.example.REST.eventsAndSchedule;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EventsListener {
    @EventListener
    public void onEvent(NewCustomerEvent event) {
        System.out.println("Pretend as you are listening event");
        System.out.println("Recived event" + event.getMessage());
    }

    // inner class testing
    public class User {

    }

}
