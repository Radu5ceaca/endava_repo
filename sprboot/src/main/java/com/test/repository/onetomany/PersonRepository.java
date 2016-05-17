package com.test.repository.onetomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.onetomany.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
