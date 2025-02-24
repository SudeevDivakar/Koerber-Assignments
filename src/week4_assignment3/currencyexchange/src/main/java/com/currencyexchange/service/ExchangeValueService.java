package com.currencyexchange.service;

import com.currencyexchange.entities.ExchangeValue;

public interface ExchangeValueService {
    public ExchangeValue findByFromAndTo(String from, String to);
}
