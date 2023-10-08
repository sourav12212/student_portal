package com.geekster.WeeklyTest8102023.Controller;

import com.geekster.WeeklyTest8102023.Model.Laptop;
import com.geekster.WeeklyTest8102023.Model.Student;
import com.geekster.WeeklyTest8102023.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student newStudent){
        return studentService.addStudent(newStudent);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable String id){
        studentService.deleteStudentById(id);
        return "deleted";
    }

    @PutMapping("student/id/{id}/phoneNumber/{phoneNumber}")
    public String updateStudentPhoneNumber(@PathVariable String id,@PathVariable String newPhoneNumber){
        return studentService.updateStudentPhoneNumber(id,newPhoneNumber);
    }
}
