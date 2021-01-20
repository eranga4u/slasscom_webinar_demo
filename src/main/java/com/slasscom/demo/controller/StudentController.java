package com.slasscom.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slasscom.demo.dto.StudentDTO;
import com.slasscom.demo.service.StudentService;

/**
 * Student CRUD operations
 * 
 * @author eranga
 *
 */
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/api/students")
	public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO student) {
		return new ResponseEntity<StudentDTO>(studentService.createStudent(student), HttpStatus.CREATED);
	}

	@GetMapping("/api/students")
	public ResponseEntity<List<StudentDTO>> getAllStudents() {
		return new ResponseEntity<List<StudentDTO>>(studentService.readAllStudent(), HttpStatus.OK);
	}

	@GetMapping("/api/students/{id}")
	public ResponseEntity<StudentDTO> getStudent(@PathVariable(value = "id") String id) {
		return new ResponseEntity<StudentDTO>(studentService.readStudent(id), HttpStatus.OK);
	}
	
}
