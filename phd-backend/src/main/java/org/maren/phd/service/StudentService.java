package org.maren.phd.service;

import org.maren.phd.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    // Create
    Student createStudent(Student student);

    // Read ALL
    List<Student> fetchStudent();

    // Read by ID
    Optional<Student> fetchStudent(Long studentId);
}
