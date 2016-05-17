package com.test.repository.onetoone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.onetoone.EmployeeDetail;

@Repository
public interface EmployeeDetailRepository extends CrudRepository<EmployeeDetail, Long>{

}
