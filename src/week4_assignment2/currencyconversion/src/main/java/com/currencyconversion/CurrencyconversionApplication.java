package com.currencyconversion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.currencyconversion.service.proxy")
@EnableDiscoveryClient
public class CurrencyconversionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyconversionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("PORT STARTED ON SERVER 8100");
	}
}
