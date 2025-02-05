package com.currencyexchange.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "exchange_value")
public class ExchangeValue {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    private String fromCurrency;

    private String toCurrency;

    private BigDecimal conversionMultiple;

    public ExchangeValue(String from_currency, String to_currency, BigDecimal conversionMultiple) {
        this.fromCurrency = from_currency;
        this.toCurrency = to_currency;
        this.conversionMultiple = conversionMultiple;
    }
}
