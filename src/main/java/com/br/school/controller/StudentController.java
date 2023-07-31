package com.br.school.controller;

import com.br.school.entity.Student;
import com.br.school.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> readStudent(@RequestBody Student student) {
        Student stu = studentService.createService(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(stu);
    }

    @GetMapping
    public ResponseEntity<List<Student>> readController() {
        List<Student> students = studentService.readService();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(students);
    }

}
