package com.dydko.runnerzwebapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("My first bean");
    }

    @Bean
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("My second bean");
    }

    @Bean
    @Primary
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("My third bean");
    }
}
