package com.project.crudapis.mappingandjoining.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.crudapis.mappingandjoining.entity.Address;
import com.project.crudapis.mappingandjoining.entity.Employee;
import com.project.crudapis.mappingandjoining.repository.AddressRepository;
import com.project.crudapis.mappingandjoining.repository.ContactRepository;
import com.project.crudapis.mappingandjoining.repository.EmployeeRepo;

@Service
public class ServicesImp implements Services{
	
	private EmployeeRepo employeeRepo;
	private ContactRepository contactRepo;
	private AddressRepository addressRepo;
	
	
	@Autowired
	public ServicesImp(EmployeeRepo employeeRepo, ContactRepository contactRepo, AddressRepository addressRepo) {
		super();
		this.employeeRepo = employeeRepo;
		this.contactRepo = contactRepo;
		this.addressRepo = addressRepo;
	}

	@Override
	public Employee createAndSave(Employee employee) {
		
		return employeeRepo.save(employee);
	}
	
	@Override
	public Employee createAndSaveById(Employee employee, Long id) {
		
		Employee existingData = employeeRepo.findById(id).get();
		if(existingData != null)
		employeeRepo.save(existingData);
		
		return existingData;
	}

	@Override
	public Optional<Employee> getEmpById(Long id) {
		
		return employeeRepo.findById(id);
	}

	@Override
	public Address createAndSave(Address address) {
		
		return null;
	}
	
	//Address RepositoryS

	
	
	

}
