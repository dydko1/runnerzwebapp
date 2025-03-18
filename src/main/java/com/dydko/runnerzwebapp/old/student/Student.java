package com.dydko.runnerzwebapp.old.student;

import com.dydko.runnerzwebapp.old.school.School;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentProfile studentProfile;
    @ManyToOne
    @JoinColumn(name = "school_id")
    @JsonBackReference
    private School school;
}