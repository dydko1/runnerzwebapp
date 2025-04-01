package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>, PagingAndSortingRepository<Student, Long> {
}
