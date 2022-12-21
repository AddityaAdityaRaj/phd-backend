package org.maren.phd.service;

import org.maren.phd.entity.Student;
import org.maren.phd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Optional<Student> fetchStudent(Long studentId) {
        return studentRepository.findById(studentId);
    }
}
