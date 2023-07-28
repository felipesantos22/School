package com.br.school.controller;

import com.br.school.entity.Student;
import com.br.school.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
     private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public Student readStudent(@RequestBody Student student) {
        return studentService.createService(student);
    }
}
