package com.test.service.business.onetoone;

import static com.test.dto.onetoone.EmployeeConverter.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.onetoone.EmployeeDTO;
import com.test.model.onetoone.Employee;
import com.test.repository.onetoone.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public EmployeeDTO create(EmployeeDTO dto) {
		final Employee employee = new Employee(dto.getFirstname(), dto.getLastname(), dto.getBirthDate(),
				dto.getPhone());

		employeeRepo.save(employee);

		EmployeeDTO resultedDTO = toDTO(employee);

		return resultedDTO;
	}

	@Override
	public EmployeeDTO read(Long id) {
		Employee employee = employeeRepo.findOne(id);
		
		EmployeeDTO dto  = toDTO(employee);
		
		return dto;
	}

	@Override
	public List<EmployeeDTO> readAll() {
		List<EmployeeDTO> employeeDTOs = new ArrayList<>();
		
		List<Employee> employees = (List<Employee>) employeeRepo.findAll();
		employeeDTOs.addAll(toDTO(employees));

		return employeeDTOs;
	}

	@Override
	public EmployeeDTO update(EmployeeDTO employee) {
		Employee employees = employeeRepo.findOne(employee.getEmployeeId());
		
//		employees.setEmployeeDetail(employee.getEmployeeDetail());
		employees.setBirthDate(employee.getBirthDate());
		employees.setPhone(employee.getPhone());
		employees.setLastname(employee.getLastname());
		employees.setFirstname(employee.getFirstname());
		
		employeeRepo.save(employees);
		
		EmployeeDTO dto =toDTO(employees);
		
		return dto ;
	}

	@Override
	public void delete(Long id) {
		employeeRepo.delete(id);
	}
}