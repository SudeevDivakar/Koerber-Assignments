package com.rds;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RdsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RdsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SERVER STARTED ON PORT 8080");
	}
}
