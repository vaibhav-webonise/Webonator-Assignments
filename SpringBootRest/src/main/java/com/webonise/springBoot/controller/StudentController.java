package com.webonise.springBoot.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webonise.springBoot.dao.StudentRepository;
import com.webonise.springBoot.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@RequestMapping(path = "/students")
	public List<Student> home() {
		return studentRepository.findAll();
	}

	@RequestMapping("/student/{studentId}")
	public Optional<Student> getStudent(@PathVariable("studentId") int studentId) {
		return studentRepository.findById(studentId);
	}

	@PostMapping(path = "/student")
	public Student addStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}

	@DeleteMapping(path = "/student/{studentId}")
	public String deleteStudent(@PathVariable int studentId) {
		Student student = studentRepository.getOne(studentId);
		studentRepository.delete(student);
		return "deleted";
	}

	@PutMapping(path = "/student")
	public Student SaveOrUpdateStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
}
