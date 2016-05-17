package com.test.repository.onetoone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.onetoone.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
