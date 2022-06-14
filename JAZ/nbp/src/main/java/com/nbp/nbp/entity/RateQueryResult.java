package com.nbp.nbp.entity;

import java.util.List;

public class RateQueryResult {
    private char table;
    private String currency;
    private String code;
    private List<CurrencyRate> rates;

    public RateQueryResult() {
    }

    public RateQueryResult(char table, String currency, String code, List<CurrencyRate> rates) {
        this.table = table;
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public char getTable() {
        return table;
    }

    public void setTable(char table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<CurrencyRate> getRates() {
        return rates;
    }

    public void setRates(List<CurrencyRate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "RateQueryResult{" +
                "table=" + table +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + rates +
                '}';
    }
}
