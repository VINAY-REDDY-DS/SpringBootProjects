package com.project.crudapis.person.service;

import java.util.List;
import java.util.Optional;

import com.project.crudapis.person.model.PersonModel;

public interface PersonService {
	
	//Save Methods
	//(Save(), saveAll(), saveAndFlush() )
	PersonModel save(PersonModel person);
	List<PersonModel> saveAll(List<PersonModel> person);
	PersonModel saveAndFlush(PersonModel person);
	
	//Get/Find Methods
	//(findAll(), findById(),
	List<PersonModel> findAll();
	Optional<PersonModel> findById(Integer id);

	//Custom Query
	List<PersonModel> findByName(String name);//Pl query
	List<PersonModel> findByAddress(String address);// Native Query
	
}
