package com.test.repository.manytomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.manytomany.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
