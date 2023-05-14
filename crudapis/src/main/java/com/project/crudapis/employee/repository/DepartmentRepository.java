package com.project.crudapis.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.crudapis.employee.entity.DepartmentModel;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentModel, Integer>{

}
