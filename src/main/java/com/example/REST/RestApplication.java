package com.example.REST;

import com.example.REST.Services.EventServicePublisher;
import com.example.REST.Services.LoggerService;
import com.example.REST.domains.Account;
import com.example.REST.domains.CreditCard;
import com.example.REST.eventsAndSchedule.NewCustomerEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.REST.repositories.AccountRepository;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RestApplication implements CommandLineRunner {
    @Autowired
	AccountRepository accountRepository;

	@Autowired
	LoggerService loggerService;

	@Autowired
	EventServicePublisher evnt;

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	public void run(String... args) {
		Account account = new Account("Nigus", "nigus@gmail.com", "12321L", 1000 );
		CreditCard creditCard1 = new CreditCard("12322", "Saving", "12/2028");
		account.setCreditCard(creditCard1);

		System.out.println("Looging here");
        loggerService.addLoggingService(); // runs not on the console, it just runs along with application logs during running
		loggerService.errorLog();

	    // add customer event
		evnt.addCustomer(new NewCustomerEvent("NEW CUSTOMER CREATED EVENT PUBLISHSED"));


	}
}
