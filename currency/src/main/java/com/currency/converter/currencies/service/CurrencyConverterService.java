package com.currency.converter.currencies.service;

import java.math.BigDecimal;

import com.currency.converter.currencies.gateway.awesomeapi.CurrencyQuoteDto;
import org.springframework.beans.factory.annotation.Autowired;



public class CurrencyConverterService {

    @Autowired
    CurrencyQuoteDto dto;


    public CurrencyQuoteDto calculateConversion(String currency, BigDecimal value) {
        // currency = as moedas: USD-BRL,EUR-BRL
        // value = o valor do produto em reais

        //usar a variável currency para chamar o findRecurrencyQuote, que vai fazer uma chamada na API
        //externa e receber um payload de cotação de moedas

        //neste payload, salvar o bid de cada cotação de moeda em uma nova variável, chamada bid

        //multiplicar o conteúdo de value pelo valor de bid de cada moeda e salvar em uma variável
        //montar um esquema de key-value, onde eu passo o nome da moeda e o valor obtido no calculo com o bid

        //criar um novo hashset chamado currency, dar um add e passar os valores de nome de moeda e resultado
        // na etapa anterior

        return dto;

    }
}
