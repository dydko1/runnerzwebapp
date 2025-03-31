package com.dydko.runnerzwebapp;

import com.dydko.runnerzwebapp.model.Student;
import com.dydko.runnerzwebapp.model.University;
import com.dydko.runnerzwebapp.repository.StudentRepository;
import com.dydko.runnerzwebapp.repository.UniversityRepository;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Log
public class JpaOneToManyDirectionalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(JpaOneToManyDirectionalApplication.class, args);

        StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);
        UniversityRepository universityRepository = configurableApplicationContext.getBean(UniversityRepository.class);

        Student student1 = new Student("123");
        Student student2 = new Student("234");
        List<Student> students = Arrays.asList(student1, student2);

        University university = new University("Politechnika",students);

        universityRepository.save(university);

    }
}