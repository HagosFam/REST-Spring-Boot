package com.example.REST.eventsAndSchedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class WelcomeTaskScheduling {
    // this method runs every 2 seconds

    // this task is scheduled to run every two seconds
    @Scheduled(fixedRate = 2000)
    public void welcome() {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeformat = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String current = timeformat.format(date);
        System.out.println("This task runs at " + current);
    }

    // this task is scheduled to run every five seconds
    @Scheduled(fixedDelay = 5000)
    public void back() {
        System.out.println("Run every 5 sec");
    }


    // this runs every five seconds on monday to friday
    @Scheduled(cron = "*/5 * * * * MON-FRI")
    public void workingDays() {
        System.out.println("Run every 5 seconds on working days");
    }

}
