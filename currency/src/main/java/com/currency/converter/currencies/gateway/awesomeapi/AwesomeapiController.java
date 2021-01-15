package com.currency.converter.currencies.gateway.awesomeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwesomeapiController implements AwesomeapiGateway {

    @Autowired
    private AwesomeapiService service;

    @Override
    public ResponseEntity<?> findCurrencyQuote(String currencies) {
        return service.findCurrencyQuote(currencies);
    }
}
