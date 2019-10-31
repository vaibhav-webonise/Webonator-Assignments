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
import com.webonise.springBoot.Service.StudentService;
import com.webonise.springBoot.exception.InvalidInputException;
import com.webonise.springBoot.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	Logger log = (Logger) LoggerFactory.getLogger(StudentController.class);

	@RequestMapping(path = "/getStudents")
	public List<Student> findAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping("/getStudent/{studentId}")
	public Optional<Student> findStudent(@PathVariable("studentId") String studentId) {
		try {
			return studentService.getStudent(Long.parseLong(studentId));
		} catch (NumberFormatException numberFormatException) {
			log.error("Exception occured:" + numberFormatException);
			throw new InvalidInputException();
		}
	}

	@DeleteMapping(path = "/deleteStudents")
	public Boolean removeAllStudents() {
		return studentService.deleteAllStudents();
	}

	@DeleteMapping(path = "/deleteStudent/{studentId}")
	public Boolean removeStudent(@PathVariable String studentId) {
		try {
			return studentService.deleteStudent(Long.parseLong(studentId));
		} catch (NumberFormatException numberFormatException) {
			log.error("Exception occured:" + numberFormatException);
			throw new InvalidInputException();
		}
	}

	@PostMapping(path = "/addStudent")
	public Boolean addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping(path = "/updateStudent")
	public Boolean SaveOrUpdateStudent(@RequestBody Student student) {
		return studentService.SaveOrUpdateStudent(student);
	}
}
