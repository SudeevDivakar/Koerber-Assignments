package com.dynamodb;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories(basePackages = "com.dynamodb.repo")
public class DynamodbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DynamodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SERVER STARTED ON PORT 8080");
	}
}
