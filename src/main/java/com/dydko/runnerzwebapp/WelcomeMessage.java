package com.dydko.runnerzwebapp;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getGreeting() {
        return "Hello Miro  ";
    }
}