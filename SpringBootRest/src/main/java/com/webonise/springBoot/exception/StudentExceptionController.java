package com.webonise.springBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionController {
	@ExceptionHandler(value = StudentNotFoundException.class)
	public ResponseEntity<Object> exception(StudentNotFoundException exception) {
		return new ResponseEntity<>("Server response : Student not found with given Id", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = InvalidInputException.class)
	public ResponseEntity<Object> exception(InvalidInputException exception){
		return new ResponseEntity<>("Server response: Invalid input",HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(value = RecordsNotAvailableException.class)
	public ResponseEntity<Object> exception(RecordsNotAvailableException exception){
		return new ResponseEntity<>("Server response: No records available to remove...!",HttpStatus.NOT_FOUND);
	}
}
