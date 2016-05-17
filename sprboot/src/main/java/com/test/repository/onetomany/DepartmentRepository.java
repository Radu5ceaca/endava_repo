package com.test.repository.onetomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.onetomany.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
