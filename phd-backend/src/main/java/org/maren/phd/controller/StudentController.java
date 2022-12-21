package org.maren.phd.controller;

import org.maren.phd.entity.Student;
import org.maren.phd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Create
	@PostMapping("/student")
	public Student createStudent(
			@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@GetMapping("/student")
	public List<Student> fetchStudent() {
		return studentService.fetchStudent();
	}

	@GetMapping("/student{id}")
	public Optional <Student> fetchStudent(@PathVariable("id") Long studentId) {
		return studentService.fetchStudent(studentId);
	}
}
