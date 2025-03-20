package com.dydko.runnerzwebapp.old.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    public String post(@RequestBody Student student) {
        studentRepository
                .save(student);
        return "Student is accepted: " + student;
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentRepository
                .findAll();
    }

    @GetMapping("/students/{student_id}")
    public Student findStudentById(@PathVariable Integer student_id) {
        return studentRepository.findById(student_id)
                .orElse(new Student());
    }

    @GetMapping("/students/search/{firstName}")
    public List<Student> findStudentByName(@PathVariable String firstName) {
        return studentRepository
                .findAllByFirstName(firstName);
    }

    @GetMapping("/students/search1/{lastName}")
    public List<Student> findStudentByLastName(@PathVariable String lastName) {
        return studentRepository
                .findAllByLastName(lastName);
    }

    @DeleteMapping("/students/{student_id}")
    public String delete(@PathVariable Integer student_id) {
        studentRepository.deleteById(student_id);
        return "Student is deleted: " + student_id;
    }
}
