package com.currency.converter.currencies.gateway.awesomeapi;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AwesomeapiGateway {
    
    @GetMapping(path = "https://economia.awesomeapi.com.br/json/all/{currencies}",produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList> findCurrencyQuote (@PathVariable(value = "currencies") String currencies);
}
