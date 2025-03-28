package com.dydko.runnerzwebapp.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String helloWorld() {
        return "Hello World";
    }
}
