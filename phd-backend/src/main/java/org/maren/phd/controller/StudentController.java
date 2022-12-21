package org.maren.phd.controller;

import java.util.List;

import org.maren.phd.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public List<Student> getStudentById(long id){
		return null;
	}
}
