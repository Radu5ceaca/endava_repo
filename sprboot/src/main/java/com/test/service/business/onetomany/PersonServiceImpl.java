package com.test.service.business.onetomany;

import static com.test.dto.onetomany.PersonConverter.toDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.onetomany.PersonDTO;
import com.test.model.onetomany.Person;
import com.test.repository.onetomany.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepo;

	@Override
	public PersonDTO create(PersonDTO dto) {
		final Person person = new Person(dto.getFirstname(), dto.getLastname(), dto.getCellphone());

		personRepo.save(person);

		PersonDTO resultedDTO = toDTO(person);

		return resultedDTO;
	}

	
	@Override
	public PersonDTO read(Long id) {
		Person person = personRepo.findOne(id);
		
		PersonDTO dto  = toDTO(person);
		
		return dto;
	}

	@Override
	public List<PersonDTO> readAll() {
		List<PersonDTO> personDTOs = new ArrayList<>();
		
		Set<Person> persons = (Set<Person>) personRepo.findAll();
		personDTOs.addAll(toDTO(persons));

		return personDTOs;
	}

	@Override
	public PersonDTO update(PersonDTO person) {
		Person persons = personRepo.findOne(person.getPersonId());
		
		persons.setBirthDate(person.getBirthDate());
		persons.setCellphone(person.getCellphone());
		persons.setLastname(person.getLastname());
		persons.setFirstname(person.getFirstname());
		
		personRepo.save(persons);
		
		PersonDTO dto =toDTO(persons);
		
		return dto ;
	}

	@Override
	public void delete(Long id) {
		personRepo.delete(id);
	}
}