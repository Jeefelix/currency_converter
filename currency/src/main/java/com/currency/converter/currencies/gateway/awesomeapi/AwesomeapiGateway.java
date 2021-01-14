package com.currency.converter.currencies.gateway.awesomeapi;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AwesomeapiGateway {
    
    @GetMapping(path = "json/all/{currencies}",produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findCurrencyQuote (@PathVariable(value = "currencies") String currencies);
}
