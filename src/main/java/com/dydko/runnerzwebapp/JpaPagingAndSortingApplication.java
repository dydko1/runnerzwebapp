package com.dydko.runnerzwebapp;


import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class JpaPagingAndSortingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaPagingAndSortingApplication.class, args);
    }
}