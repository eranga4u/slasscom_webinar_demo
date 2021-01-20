package com.slasscom.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.slasscom.demo.domain.Student;

/**
 * 
 * @author eranga
 *
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
