package com.slasscom.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slasscom.demo.domain.Student;
import com.slasscom.demo.dto.StudentDTO;
import com.slasscom.demo.repository.StudentRepository;
import com.slasscom.demo.service.StudentService;

/**
 * 
 * @author eranga
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentDTO createStudent(StudentDTO student) {
		Student studentDomain = new Student();
		BeanUtils.copyProperties(student, studentDomain);
		student.setId(studentRepository.save(studentDomain).getId());
		return student;

	}

	@Override
	public StudentDTO readStudent(String id) {

		Student studentDomain = studentRepository.findById(id).get();
		StudentDTO studentDTO = new StudentDTO();
		BeanUtils.copyProperties(studentDomain, studentDTO);
		return studentDTO;

	}

	@Override
	public List<StudentDTO> readAllStudent() {
		List<Student> students = studentRepository.findAll();
		List<StudentDTO> studentsDTO = new ArrayList<>();
		for (Student student : students) {
			StudentDTO studentDto = new StudentDTO();
			BeanUtils.copyProperties(student, studentDto);
			studentsDTO.add(studentDto);
		}

		return studentsDTO;
	}

}
