package com.project.crudapis.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.crudapis.employee.entity.EmployeeModel;
import com.project.crudapis.employee.repository.DepartmentRepository;
import com.project.crudapis.employee.repository.EmployeeRepository;

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
	
	@Override
	public List<EmployeeModel> createAndSaveAll(List<EmployeeModel> employee) {
		
		return employeeRepo.saveAll(employee);	}

	@Override
	public Optional<EmployeeModel> getAllEmployees(Integer id) {
		
		return employeeRepo.findById(id);
	}

	public List<EmployeeModel> findByDepartment(String department) {
		return employeeRepo.findByDepartment(department);
	}

	@Override
	public List<EmployeeModel> findByDepartment1(String department) {
		
		return employeeRepo.findByDepartment1(department);
	}
	

}
