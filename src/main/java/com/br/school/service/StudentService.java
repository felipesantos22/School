package com.br.school.service;

import com.br.school.entity.Student;
import com.br.school.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createService(Student student) {
        return studentRepository.save(student);
    }
}
