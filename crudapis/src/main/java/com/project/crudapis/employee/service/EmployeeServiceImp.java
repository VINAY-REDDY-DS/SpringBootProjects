package com.project.crudapis.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.crudapis.employee.entity.EmployeeModel;
import com.project.crudapis.employee.repository.DepartmentRepository;
import com.project.crudapis.employee.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private DepartmentRepository departmentRepo;
	
	public EmployeeServiceImp(EmployeeRepository employeeRepo, DepartmentRepository departmentRepo) {
		this.employeeRepo = employeeRepo;
		this.departmentRepo = departmentRepo;
	}


	


	@Override
	public EmployeeModel createAndSave(EmployeeModel employee) {
		
		return employeeRepo.save(employee);
	}


	

}
