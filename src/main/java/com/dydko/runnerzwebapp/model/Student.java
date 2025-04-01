package com.dydko.runnerzwebapp.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String firstName;
    private String lastName;

    Student() {
    }

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
