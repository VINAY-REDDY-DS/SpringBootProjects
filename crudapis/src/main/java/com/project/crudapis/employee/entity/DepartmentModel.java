package com.project.crudapis.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "department_info")
public class DepartmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer dpt_id;
	
	@Column(name = "dpt_name")
	private String name;
	
	@Column(name = "dep_sal")
	private Double salary;

	public DepartmentModel(Integer dpt_id, String name, Double salary) {
		super();
		this.dpt_id = dpt_id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getDpt_id() {
		return dpt_id;
	}

	public void setDpt_id(Integer dpt_id) {
		this.dpt_id = dpt_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
