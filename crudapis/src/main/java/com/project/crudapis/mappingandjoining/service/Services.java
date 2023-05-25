package com.project.crudapis.mappingandjoining.service;

import java.util.Optional;

import com.project.crudapis.mappingandjoining.entity.Address;
import com.project.crudapis.mappingandjoining.entity.Employee;

public interface Services {
	
	public Employee createAndSave(Employee employee);
	public Optional<Employee> getEmpById(Long id);
	public Employee createAndSaveById(Employee employee, Long id);
	
	//Address Repository
	public Address createAndSave(Address address);

}
