package com.currencyexchange.repo;

import com.currencyexchange.entities.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Integer> {
    @Query("SELECT e FROM ExchangeValue e WHERE e.fromCurrency = ?1 AND e.toCurrency = ?2")
    public ExchangeValue findByFromCurrencyAndToCurrency(String from, String to);
}
