package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
