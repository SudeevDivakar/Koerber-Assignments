package com.bookapp;

import com.bookapp.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookapplicationApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("PORT STARTED ON SERVER 3000");
	}
}
