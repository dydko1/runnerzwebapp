package com.dydko.runnerzwebapp.old.school;

import com.dydko.runnerzwebapp.old.student.Student;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class School {

    @Id
    @GeneratedValue
    private Integer id;
    private String schoolName;
    @OneToMany(mappedBy = "school")
    @JsonManagedReference
    private List<Student> students;
}
