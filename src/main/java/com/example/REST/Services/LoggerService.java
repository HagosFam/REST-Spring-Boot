package com.example.REST.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerService {
    Logger logger = LoggerFactory.getLogger(LoggerService.class);

    public void addLoggingService() {
         logger.warn("A debug message");
    }

    public void errorLog() {
        logger.info("This is just info log");
    }





}
