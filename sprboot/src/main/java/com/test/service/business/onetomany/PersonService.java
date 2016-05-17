/**
 * 
 */
package com.test.service.business.onetomany;

import java.util.List;

import com.test.dto.onetomany.PersonDTO;


/**
 * @author ceaca
 *
 */
public interface PersonService {

	public PersonDTO create(PersonDTO person);

	public PersonDTO read(Long id);

	public List<PersonDTO> readAll();

	public PersonDTO update(PersonDTO person);

	public void delete(Long id);

}
