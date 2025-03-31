package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
