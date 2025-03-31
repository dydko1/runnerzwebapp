package com.dydko.runnerzwebapp;

import com.dydko.runnerzwebapp.model.Address;
import com.dydko.runnerzwebapp.model.User;
import com.dydko.runnerzwebapp.repository.AddressRepository;
import com.dydko.runnerzwebapp.repository.UserRepository;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
@Log
public class OneToOneUniDirectionalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(OneToOneUniDirectionalApplication.class, args);

        AddressRepository addressRepository =
                configurableApplicationContext.getBean(AddressRepository.class);
        UserRepository userRepository =
                configurableApplicationContext.getBean(UserRepository.class);

        Address address = new Address("Złota 12");
        addressRepository.save(address);
        User user = new User("Miro", address);
        userRepository.save(user);


    }
}