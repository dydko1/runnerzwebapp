package com.dydko.runnerzwebapp;

import com.dydko.runnerzwebapp.run.Location;
import com.dydko.runnerzwebapp.run.Run;
import com.dydko.runnerzwebapp.run.RunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner runner(RunRepository repository) {
//        return a -> {
//            Run run = new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plusDays(2), 2, Location.INDOOR);
//            repository.create(run);
//        };
//    }
}