package com.webonise.springBoot.controller;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webonise.springBoot.dao.StudentRepository;
import com.webonise.springBoot.exception.StudentNotFoundException;
import com.webonise.springBoot.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	Logger log = (Logger) LoggerFactory.getLogger(StudentController.class);

	@RequestMapping(path = "/students")
	public List<Student> home() {
		return studentRepository.findAll();
	}

	@RequestMapping("/student/{studentId}")
	public Optional<Student> getStudent(@PathVariable("studentId") int studentId) {
		if (!studentRepository.existsById(studentId))
			throw new StudentNotFoundException();
		return studentRepository.findById(studentId);
	}

	@PostMapping(path = "/student")
	public Boolean addStudent(@RequestBody Student student) {
		studentRepository.save(student);
		log.info("New student is added :" + student.toString());
		return true;
	}

	@DeleteMapping(path = "/student/{studentId}")
	public Boolean deleteStudent(@PathVariable int studentId) {
		if (!studentRepository.existsById(studentId))
			throw new StudentNotFoundException();
		Student student = studentRepository.getOne(studentId);
		studentRepository.delete(student);
		log.info("student is removed from database :" + student.toString());
		return true;
	}

	@PutMapping(path = "/student")
	public Boolean SaveOrUpdateStudent(@RequestBody Student student) {
		studentRepository.save(student);
		log.info("Student is updated :" + student.toString());
		return true;
	}
}
