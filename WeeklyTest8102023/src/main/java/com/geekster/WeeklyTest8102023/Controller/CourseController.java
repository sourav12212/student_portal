package com.geekster.WeeklyTest8102023.Controller;

import com.geekster.WeeklyTest8102023.Model.Address;
import com.geekster.WeeklyTest8102023.Model.Course;
import com.geekster.WeeklyTest8102023.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course newCourse){
        return courseService.addCourse(newCourse);
    }

    @GetMapping("course")
    public List<Course> getCourse(){
        return courseService.getAllCourse();
    }

    @DeleteMapping("course/{id}")
    public  String deleteById(@PathVariable String id){
        return  courseService.deleteById(id);
    }

    @PutMapping("courseName/{id}/name/{name}")
    public String updateCourseName(@PathVariable String id, @PathVariable String name)
    {
        return courseService.updateCourseName(id, name);
    }


}
