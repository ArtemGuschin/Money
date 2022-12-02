package com.example.money;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.money")
@PropertySource("classpath:money.properties")
public class SpringConfig {

    @Bean
    public Wallet wallet() {
        return new Wallet();
    }

    @Bean
    public Money dollars(@Value("${money.dollars}") double dollars) {
        return new Money(dollars, new Dollars());
    }

    @Bean
    public Money euros(@Value("${money.euros}") double euros) {
        return new Money(euros, new Euros());
    }

    @Bean
    public Money rubles(@Value("${money.rubles}") double rubles) {
        return new Money(rubles, new Rubles());
    }

    @Bean
    public Money pesos(@Value("${money.pesos}") double pesos) {
        return new Money(pesos, new Pesos());
    }
}