package com.project.crudapis.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.crudapis.employee.entity.EmployeeModel;
import com.project.crudapis.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	@PostMapping("/createData")
	public EmployeeModel createAndSave(@RequestBody EmployeeModel employee){
		return employeeService.createAndSave(employee);
	}
	
	@PostMapping("/createAllData")
	public List<EmployeeModel> createAndSaveAll(@RequestBody List<EmployeeModel> employee){
		return employeeService.createAndSaveAll(employee);
	}
	
	@GetMapping("/getEmployeesById/{id}")
	public Optional<EmployeeModel> getAllEmployees(@PathVariable Integer id) {
		return employeeService.getAllEmployees(id);
	}
	
	@GetMapping("/getEmployeesByDepartment/{department}")
	public List<EmployeeModel> findByDepartment(@PathVariable String department ) {
		return employeeService.findByDepartment(department);
	}
	
	@GetMapping("/getEmployeesByDepartment1/{department}")
	public List<EmployeeModel> findByDepartment1(@PathVariable String department ) {
		return employeeService.findByDepartment1(department);
	}
	
	

}
 