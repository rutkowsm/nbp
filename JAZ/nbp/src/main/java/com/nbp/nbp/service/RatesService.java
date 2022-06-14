package com.nbp.nbp.service;

import com.nbp.nbp.entity.CurrencyRate;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RatesService {

    private static final String RATES_URL = "https://api.nbp.pl/api/exchangerates/rates/a";

    private final RestTemplate restTemplate;

    public RatesService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CurrencyRate getTodayRateByCode(String code){
        return this.restTemplate.exchange(RATES_URL + "/" + code + "/today/", HttpMethod.GET, null,
                CurrencyRate.class).getBody();
    }

    public CurrencyRate getTodayRateUsd(){
        return this.restTemplate.exchange(RATES_URL + "/USD/today/", HttpMethod.GET, null,
                CurrencyRate.class).getBody();
    }
}
