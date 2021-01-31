package com.currency.converter.currencies.gateway.awesomeapi;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AwesomeapiService {

    @Autowired
    private AwesomeapiGateway awesomeapiGateway;

    public ResponseEntity<ArrayList> findCurrencyQuote(String currencies) {
        try {
            return awesomeapiGateway.findCurrencyQuote(currencies);
        } catch (Exception e) {
            log.warn("Error to return currency quote");
            return null;
        }
    }
}