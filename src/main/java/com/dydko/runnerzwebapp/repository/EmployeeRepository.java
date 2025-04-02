package com.dydko.runnerzwebapp.repository;


import com.dydko.runnerzwebapp.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
