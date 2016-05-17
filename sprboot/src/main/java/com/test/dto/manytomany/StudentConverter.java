package com.test.dto.manytomany;

import java.util.HashSet;
import java.util.Set;

import com.test.model.manytomany.Student;

/**
 * @author ceaca
 *
 */
public class StudentConverter {
		private StudentConverter() {
		}

		public static StudentDTO toDTO(Student model) {
			StudentDTO dto = null;

			if (model != null) {
				dto = new StudentDTO();
				dto.setStudentId(model.getStudentId());
			}

			return dto;
		}
		
		public static Set<StudentDTO> toDTO(Set<Student> models) {
			Set<StudentDTO> studentDTOs = new HashSet<>();
			
			if ((models != null) && (!models.isEmpty())){
				for (Student model : models){
					StudentDTO dto = toDTO(model);
					studentDTOs.add(dto);
				}
			}
			
			return studentDTOs;
		}
	}
