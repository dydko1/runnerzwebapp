package com.dydko.runnerzwebapp;

import com.dydko.runnerzwebapp.model.Person;
import com.dydko.runnerzwebapp.repository.PersonRepository;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Log
public class H2SetupApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(H2SetupApplication.class, args);

        PersonRepository personRepository =
                configurableApplicationContext.getBean(PersonRepository.class);

        Person person = new Person("John", "Doe");
        personRepository.save(person);
        System.out.println("papa");
    }
}