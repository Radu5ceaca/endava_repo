package com.test.service.business.manytomany;

import java.util.List;

import com.test.dto.manytomany.StudentDTO;


/**
 * @author ceaca
 *
 */
public interface StudentService {

	public StudentDTO create (StudentDTO student);

	public StudentDTO read(Long id);

	public List<StudentDTO> readAll();

	public StudentDTO update(StudentDTO student);

	public void delete(Long id);

}
