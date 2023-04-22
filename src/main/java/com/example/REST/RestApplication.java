package com.example.REST;

import com.example.REST.Services.LoggerService;
import com.example.REST.domains.Account;
import com.example.REST.domains.CreditCard;
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

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	public void run(String... args) {
		Account account = new Account("Nigus", "nigus@gmail.com", "12321L", 1000 );
		CreditCard creditCard1 = new CreditCard("12322", "Saving", "12/2028");
		account.setCreditCard(creditCard1);

		System.out.println("Looging here");
        loggerService.addLoggingService();
		loggerService.errorLog();



	}
}
