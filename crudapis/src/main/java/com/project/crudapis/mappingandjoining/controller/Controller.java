package com.project.crudapis.mappingandjoining.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.crudapis.mappingandjoining.entity.Employee;
import com.project.crudapis.mappingandjoining.service.Services;

@RestController
@RequestMapping("/api/mapping")
public class Controller {
	
	@Autowired
	private Services services;
	
	@PostMapping("/post")
	public Employee createAndSave(@RequestBody Employee employee) {
		return services.createAndSave(employee);
	}
	
	@GetMapping("/getEmpById/{id}")
	public Optional<Employee> getEmpById(@PathVariable Long id) {
		return services.getEmpById(id);
	}
	
	@PostMapping("/postById/{id}")
	public Employee createAndSaveById(@RequestBody Employee employee, @PathVariable Long id) {
		return services.createAndSaveById(employee, id);
	}

}
