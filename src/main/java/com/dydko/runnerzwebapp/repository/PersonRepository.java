package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
