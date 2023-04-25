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
    @Scheduled(fixedRate = 2000) // when the method starts running, it calls again every two seconds
    public void welcome() {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeformat = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String current = timeformat.format(date);
        System.out.println("This task runs at " + current);
    }

    // this task is scheduled to run every five seconds
    @Scheduled(fixedDelay = 5000) // after the method finished running, it waits for 5 seconds before runs again
    public void back() {
        System.out.println("Run every 5 sec");
    }


    // this runs every five seconds on monday to friday
    @Scheduled(cron = "*/5 * * * * MON-FRI") // an experssion
    public void workingDays() {
        System.out.println("Run every 5 seconds on working days");
    }

}
