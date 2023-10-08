package com.geekster.WeeklyTest8102023.Service;

import com.geekster.WeeklyTest8102023.Model.Student;
import com.geekster.WeeklyTest8102023.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public String addStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return "added";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepo.findById(id).orElseThrow();
    }

    public void deleteStudentById(String id) {
        studentRepo.deleteById(id);
    }

    public String updateStudentPhoneNumber(String id, String newPhoneNumber) {
        Student student = studentRepo.findById(id).orElse(null);
        if(student != null){
            student.setPhoneNumber(newPhoneNumber);
            studentRepo.save(student);
        }
        return "student phone number update";
    }

}
