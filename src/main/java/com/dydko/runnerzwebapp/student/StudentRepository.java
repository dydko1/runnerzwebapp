package com.dydko.runnerzwebapp.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByFirstName(String firstName);

    List<Student> findAllByLastName(String lastName);
}
