package com.br.school.controller;
import com.br.school.entity.Course;
import com.br.school.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<Course> createController(@RequestBody Course course) {
        Course crs = courseService.createService(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(crs);
    }

    @GetMapping
    public ResponseEntity<List<Course>> readController(){
        List<Course> courses = courseService.readService();
        return ResponseEntity.ok().body(courses);
    }

}
