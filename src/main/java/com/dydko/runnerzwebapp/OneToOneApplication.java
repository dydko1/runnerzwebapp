package com.dydko.runnerzwebapp;

import com.dydko.runnerzwebapp.model.Car;
import com.dydko.runnerzwebapp.model.Owner;
import com.dydko.runnerzwebapp.repository.CarRepository;
import com.dydko.runnerzwebapp.repository.OwnerRepository;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
@Log
public class OneToOneApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(OneToOneApplication.class, args);

        CarRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
        OwnerRepository ownerRepository = configurableApplicationContext.getBean(OwnerRepository.class);

        Car carMira = new Car("audi");
        Owner miro = new Owner("Miro");

        miro.setCar(carMira);
        carRepository.save(carMira);
        ownerRepository.save(miro);

        Optional<Car> optionalCar = carRepository.findById(1L);
        Optional<Owner> optionalOwner = ownerRepository.findById(1L);

        optionalCar.ifPresent(c -> log.info(c.getModel()));
        optionalOwner.ifPresent(o-> System.out.println(o.getName()));
    }
}