package com.webonise.springBoot.Service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webonise.springBoot.dao.StudentRepository;
import com.webonise.springBoot.exception.RecordsNotAvailableException;
import com.webonise.springBoot.exception.StudentNotFoundException;
import com.webonise.springBoot.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	Logger log = (Logger) LoggerFactory.getLogger(StudentService.class);

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Boolean deleteAllStudents() {
		if (studentRepository.count() == 0) {
			log.info("No records found...!");
			throw new RecordsNotAvailableException();
		}
		studentRepository.deleteAll();
		return true;
	}

	public Optional<Student> getStudent(long studentId) {
		if (!studentRepository.existsById(studentId)) {
			log.info("Student not found with given Id: " + studentId);
			throw new StudentNotFoundException();
		}
		return studentRepository.findById(studentId);
	}

	public Boolean addStudent(Student student) {
		studentRepository.save(student);
		log.info("New student is added :" + student.toString());
		return true;
	}

	public Boolean deleteStudent(long studentId) {
		if (!studentRepository.existsById(studentId)) {
			log.info("Student not found with given Id: " + studentId);
			throw new StudentNotFoundException();
		}
		Student student = studentRepository.getOne(studentId);
		studentRepository.delete(student);
		return true;
	}

	public Boolean SaveOrUpdateStudent(Student student) {
		studentRepository.save(student);
		log.info("Student is updated :" + student.toString());
		return true;
	}
}
