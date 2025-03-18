package com.dydko.runnerzwebapp.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class StudentProfile {

    @Id
    @GeneratedValue
    private Integer id;
    private String bio;
    @OneToOne
    private Student student;
}
