package com.currencyexchange;

import com.currencyexchange.entities.ExchangeValue;
import com.currencyexchange.repo.ExchangeValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.math.BigDecimal;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyexchangeApplication implements CommandLineRunner {
	private ExchangeValueRepo exchangeValueRepo;

	@Autowired
	public CurrencyexchangeApplication(ExchangeValueRepo exchangeValueRepo) {
		this.exchangeValueRepo = exchangeValueRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(CurrencyexchangeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		exchangeValueRepo.save(new ExchangeValue("USD", "INR", new BigDecimal("87.42")));
		exchangeValueRepo.save(new ExchangeValue("EUR", "INR", new BigDecimal("91")));
		System.out.println("PORT STARTED ON 8000");
	}
}
