/**
 * 
 */
package com.test.dto.onetomany;

import java.util.HashSet;
import java.util.Set;

import com.test.model.onetomany.Person;

/**
 * @author ceaca
 *
 */
public class PersonConverter {
	private PersonConverter() {
	}

	public static PersonDTO toDTO(Person model) {
		PersonDTO dto = null;

		if (model != null) {
			DepartmentDTO departmentDTO = DepartmentConverter.toDTO(model.getDepartment());
			dto = new PersonDTO(model.getFirstname(), model.getLastname(), model.getBirthDate(), model.getCellphone(), departmentDTO);
			dto.setPersonId(model.getPersonId());
		}

		return dto;
	}

	public static Set<PersonDTO> toDTO(Set<Person> models) {
		Set<PersonDTO> personDTOs = new HashSet<>();

		if ((models != null) && (!models.isEmpty())) {
			for (Person model : models) {
				PersonDTO dto = toDTO(model);
				personDTOs.add(dto);
			}
		}

		return personDTOs;
	}
}
