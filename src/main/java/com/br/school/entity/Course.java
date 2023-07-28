package com.br.school.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "course")
    private List<Student> students = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "course_discipline",
            joinColumns = {@JoinColumn(name = "discipline_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    List<Discipline> disciplines = new ArrayList<>();


}
