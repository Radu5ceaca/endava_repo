package com.test.dto.onetoone;

import java.util.ArrayList;
import java.util.List;

import com.test.model.onetoone.Employee;

public class EmployeeConverter {

	/**
	 * Prevent Instantiation of Utility Class.
	 */
	private EmployeeConverter() {
	}

	public static EmployeeDTO toDTO(Employee model) {
		EmployeeDTO dto = null;

		if (model != null) {
			dto = new EmployeeDTO(model.getFirstname(), model.getLastname(), model.getBirthDate(), model.getPhone());
			dto.setEmployeeId(model.getEmployeeId());
		}

		return dto;
	}
	
	public static List<EmployeeDTO> toDTO(List<Employee> models) {
		List<EmployeeDTO> employeeDTOs = new ArrayList<>();
		
		if ((models != null) && (!models.isEmpty())){
			for (Employee model : models){
				EmployeeDTO dto = toDTO(model);
				employeeDTOs.add(dto);
			}
		}
		
		return employeeDTOs;
	}
}