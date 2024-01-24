package com.example.maven01.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.maven01.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
