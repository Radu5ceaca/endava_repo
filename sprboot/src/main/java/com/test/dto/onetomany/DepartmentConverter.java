/**
 * 
 */
package com.test.dto.onetomany;

import java.util.ArrayList;
import java.util.List;

import com.test.model.onetomany.Department;

/**
 * @author ceaca
 *
 */
public class DepartmentConverter {
	
	private DepartmentConverter() {
	}

	public static DepartmentDTO toDTO(Department model) {
		DepartmentDTO dto = null;

		if (model != null) {
			dto = new DepartmentDTO(model.getDepartmentName());
			dto.setDepartmentId(model.getDepartmentId());
		}

		return dto;
	}

	public static List<DepartmentDTO> toDTO(List<Department> models) {
		List<DepartmentDTO> departmentDTOs = new ArrayList<>();

		if ((models != null) && (!models.isEmpty())) {
			for (Department model : models) {
				DepartmentDTO dto = toDTO(model);
				departmentDTOs.add(dto);
			}
		}

		return departmentDTOs;
	}
}