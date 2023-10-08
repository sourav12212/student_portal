package com.geekster.WeeklyTest8102023.Service;

import com.geekster.WeeklyTest8102023.Model.Course;
import com.geekster.WeeklyTest8102023.Repository.CouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CouseRepo couseRepo;

    public String addCourse(Course newCourse) {
        couseRepo.save(newCourse);
        return "course added";
    }

    public List<Course> getAllCourse() {
        return couseRepo.findAll();
    }

    public String deleteById(String id) {
        couseRepo.deleteById(id);
        return "deleted";
    }

    public String updateCourseName(String id, String name) {
        couseRepo.findById(id).orElse(null);
        return "successfully updated";
    }
}
