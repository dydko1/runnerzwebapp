package com.dydko.runnerzwebapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String indexNumber;

    Student() {
    }

    public Student(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
