package com.example.REST;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	public void run(String... args) {
		System.out.println("running");
	}

}
