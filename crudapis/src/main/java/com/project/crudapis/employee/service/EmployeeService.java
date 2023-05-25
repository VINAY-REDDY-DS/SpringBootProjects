package com.project.crudapis.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.project.crudapis.employee.entity.EmployeeModel;

public interface EmployeeService {

	EmployeeModel createAndSave(EmployeeModel employee);
	List<EmployeeModel> createAndSaveAll(List<EmployeeModel> employee);
	Optional<EmployeeModel> getAllEmployees(Integer id);
	public List<EmployeeModel> findByDepartment(String department );
	public List<EmployeeModel> findByDepartment1(String department);

}
