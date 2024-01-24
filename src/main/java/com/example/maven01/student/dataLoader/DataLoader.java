package com.example.maven01.student.dataLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.maven01.student.model.Student;
import com.example.maven01.student.service.StudentService;

//@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    StudentService studentService;

    
    @Override
    public void run(String... args) throws Exception {
        Student newStudent = new Student();
        newStudent.setName("Thomas");
        studentService.createOrUpdateStudent(newStudent);
    }
    
}
