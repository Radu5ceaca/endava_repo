package com.test.service.business.onetoone;

import java.util.List;

import com.test.dto.onetoone.EmployeeDTO;

public interface EmployeeService {

	public EmployeeDTO create(EmployeeDTO employee);

	public EmployeeDTO read(Long id);

	public List<EmployeeDTO> readAll();

	public EmployeeDTO update(EmployeeDTO employee);

	public void delete(Long id);

}
