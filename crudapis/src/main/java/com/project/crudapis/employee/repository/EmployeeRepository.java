package com.project.crudapis.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.crudapis.employee.entity.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer>{

	@Query("select e.id , e.name , d.dpt_id , d.name from employee e join department d on e.id = d.dpt_id where d.name = :name")
	public List<EmployeeModel> findByDepartment(@Param("name") String department);
	
	@Query("select e.id, e.name from employee e Join department d on e.id = d.dpt_id where d.name= :name")
	public List<EmployeeModel> findByDepartment1(@Param("name") String department);

	
	
	
}
