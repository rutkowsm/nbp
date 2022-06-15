package com.nbp.nbp.service;

import com.nbp.nbp.entity.Rate;
import com.nbp.nbp.entity.RateQueryResult;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class RatesService {

    private static final String RATES_URL = "https://api.nbp.pl/api/exchangerates/rates/a";

    private final RestTemplate restTemplate;

    public RatesService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RateQueryResult getTodayRateByCode(String code){
        return this.restTemplate.exchange(RATES_URL + "/" + code + "/today/", HttpMethod.GET, null,
                RateQueryResult.class).getBody();
    }

    public RateQueryResult getTodayRateUsd(){
        return this.restTemplate.exchange(RATES_URL + "/USD/today/", HttpMethod.GET, null,
                RateQueryResult.class).getBody();
    }

    public RateQueryResult getRateUsdByDate(String effectiveDate) {
        return this.restTemplate.exchange(RATES_URL + "/USD/" + effectiveDate + "/", HttpMethod.GET, null,
                RateQueryResult.class).getBody();
    }

    public RateQueryResult getRateByDateAndCode(String code, String effectiveDate) {
        return this.restTemplate.exchange(RATES_URL + "/" + code +  "/" + effectiveDate + "/", HttpMethod.GET, null,
                RateQueryResult.class).getBody();
    }
}
