package com.geekster.WeeklyTest8102023.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinColumn(name = "fk_course_student")
    List<Student> studentList;

}
