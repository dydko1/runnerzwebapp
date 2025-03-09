package com.dydko.runnerzwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        var ctx = SpringApplication.run(Application.class, args);
        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellStory());
        System.out.println("--------------------------------");
    }
}