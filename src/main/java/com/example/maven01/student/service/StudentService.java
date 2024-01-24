package com.example.maven01.student.service;

import java.util.List;

import com.example.maven01.student.model.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student createOrUpdateStudent(Student student);
    void deleteStudent(int id);
}
