package com.project.crudapis.person.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.crudapis.person.model.PersonModel;
import com.project.crudapis.person.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	//Save methods 
	//(save(), saveAll(), saveAndflush() )
	@PostMapping("/save")
	public PersonModel save(@RequestBody PersonModel person) {
		return personService.save(person);
	}
	
	@PostMapping("/saveAll")
	public List<PersonModel> saveAll(@RequestBody List<PersonModel>  person) {
		return personService.saveAll(person);
	}
	
	@PostMapping("/saveAndFlush")
	public PersonModel saveAndFlush(@RequestBody PersonModel person) {
		
		return personService.saveAndFlush(person);
	}
	
	//both methods are working same
	
	//Get/Find methods
	//( findAll(), findById() )
	@GetMapping("/findAll")
	public List<PersonModel> findAll(){
		return personService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Optional<PersonModel> findById(@PathVariable Integer id){
		return personService.findById(id);
	}
	
	//Custom Queries
	@GetMapping("/findByName/{name}")
	public List<PersonModel> findByName(@PathVariable String  name) {
		return personService.findByName(name);
	}
	
	@GetMapping("/findByAddress/{address}")
	public List<PersonModel> findByAddress(@PathVariable String address){
		return personService.findByAddress(address);
	}

}
