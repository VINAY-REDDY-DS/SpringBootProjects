package com.project.crudapis.person.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.crudapis.person.model.PersonModel;
import com.project.crudapis.person.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService{
	
	@Autowired
	private PersonRepository personRepo;

	public PersonServiceImp(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}

	@Override
	public PersonModel save(PersonModel person) {
		
		return personRepo.save(person);
	}
	
	@Override
	public List<PersonModel> saveAll(List<PersonModel> person) {
		
		return personRepo.saveAll(person);
	}

	@Override
	public PersonModel saveAndFlush(PersonModel person) {
		
		return personRepo.saveAndFlush(person);
	}

	@Override
	public List<PersonModel> findAll() {
	
		return personRepo.findAll();
	}

	@Override
	public Optional<PersonModel> findById(Integer id) {
		
		return personRepo.findById(id);
	}

	@Override
	public List<PersonModel> findByName(String name) {
		
		return personRepo.findByName(name);
	}

	@Override
	public List<PersonModel> findByAddress(String address) {
		
		return personRepo.findByAddress(address);
	}

}
