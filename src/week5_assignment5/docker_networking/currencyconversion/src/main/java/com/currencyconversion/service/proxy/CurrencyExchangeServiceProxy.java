package com.currencyconversion.service.proxy;

import com.currencyconversion.dto.CurrencyConversionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange", url = "http://currencyexchange:8000")
//@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionDTO retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
