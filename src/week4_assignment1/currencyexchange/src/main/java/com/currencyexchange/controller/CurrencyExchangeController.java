package com.currencyexchange.controller;

import com.currencyexchange.entities.ExchangeValue;
import com.currencyexchange.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "currency-exchange")
public class CurrencyExchangeController {

    private ExchangeValueService exchangeValueService;

    @Autowired
    public CurrencyExchangeController(ExchangeValueService exchangeValueService) {
        this.exchangeValueService = exchangeValueService;
    }

    @GetMapping("from/{from}/to/{to}")
    public ResponseEntity<ExchangeValue> retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        return ResponseEntity.status(HttpStatus.OK).body(exchangeValueService.findByFromAndTo(from, to));
    }
}
