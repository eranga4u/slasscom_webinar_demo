package com.slasscom.demo.service;

import java.util.List;

import com.slasscom.demo.dto.StudentDTO;

/**
 * 
 * @author eranga
 *
 */
public interface StudentService {

	StudentDTO createStudent(StudentDTO student);

	StudentDTO readStudent(String id);
	
	List<StudentDTO> readAllStudent();
	

}
