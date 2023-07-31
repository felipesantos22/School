package com.br.school.service;

import com.br.school.entity.Course;
import com.br.school.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createService(Course course) {
        return courseRepository.save(course);
    }


}



