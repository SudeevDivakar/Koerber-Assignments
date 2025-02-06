package com.currencyconversion.controller;

import com.currencyconversion.dto.CurrencyConversionDTO;
import com.currencyconversion.service.proxy.CurrencyExchangeServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "currency-conversion")
public class CurrencyConversionController {
    private final CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

    @Autowired
    public CurrencyConversionController(CurrencyExchangeServiceProxy currencyExchangeServiceProxy) {
        this.currencyExchangeServiceProxy = currencyExchangeServiceProxy;
    }

    @GetMapping("from/{from}/to/{to}/quantity/{quantity}")
    public ResponseEntity<CurrencyConversionDTO> convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable Double quantity) {
        CurrencyConversionDTO response = currencyExchangeServiceProxy.retrieveExchangeValue(from, to);
        return ResponseEntity.status(HttpStatus.OK).body(new CurrencyConversionDTO(from, to, quantity, response.getConversionMultiple(), quantity * response.getConversionMultiple()));
    }
}
