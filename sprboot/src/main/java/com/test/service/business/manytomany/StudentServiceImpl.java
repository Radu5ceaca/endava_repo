package com.test.service.business.manytomany;

import static com.test.dto.manytomany.StudentConverter.toDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.manytomany.StudentDTO;
import com.test.model.manytomany.Student;
import com.test.repository.manytomany.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public StudentDTO create(StudentDTO dto) {
		final Student student = new Student();

		studentRepo.save(student);

		StudentDTO resultedDTO = toDTO(student);

		return resultedDTO;
	}

	
	@Override
	public StudentDTO read(Long id) {
		Student student = studentRepo.findOne(id);
		
		StudentDTO dto  = toDTO(student);
		
		return dto;
	}

	@Override
	public List<StudentDTO> readAll() {
		List<StudentDTO> studentDTOs = new ArrayList<>();
		
		Set<Student> students = (Set<Student>) studentRepo.findAll();
		studentDTOs.addAll(toDTO(students));

		return studentDTOs;
	}

	@Override
	public StudentDTO update(StudentDTO student) {
		Student students = studentRepo.findOne(student.getStudentId());
		

//		
//		persons.setBirthDate(person.getBirthDate());
//		persons.setCellphone(person.getCellphone());
//		persons.setLastname(person.getLastname());
//		persons.setFirstname(person.getFirstname());
//		
		studentRepo.save(students);
		
		StudentDTO dto =toDTO(students);
		
		return dto ;
	}


	@Override
	public void delete(Long id) {
		studentRepo.delete(id);
	}
}