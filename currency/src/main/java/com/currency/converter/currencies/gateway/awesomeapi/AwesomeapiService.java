package com.currency.converter.currencies.gateway.awesomeapi;

import java.rmi.ServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AwesomeapiService {

    @Autowired
    private AwesomeapiGateway awesomeapiGateway;

    public ResponseEntity<?> findCurrencyQuote(String currencies) throws ServerException {
        try {
            return awesomeapiGateway.findCurrencyQuote(currencies);
        } catch (Exception e) {
            log.warn("Error to return currency quote");
            throw new ServerException(e.getMessage());
        }
    }
}