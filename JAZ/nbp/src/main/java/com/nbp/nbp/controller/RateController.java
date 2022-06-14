package com.nbp.nbp.controller;

import com.nbp.nbp.entity.CurrencyRate;
import com.nbp.nbp.service.RatesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/nbp")
public class RateController {

    public RatesService ratesService;

    RateController(RatesService ratesService){
        this.ratesService = ratesService;
    }

    @GetMapping("/today/{code}")
    public ResponseEntity<CurrencyRate> getTodayRateByCode(@PathVariable String code){
        return ResponseEntity.ok(ratesService.getTodayRateByCode(code));
    }


}
