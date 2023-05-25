package com.project.crudapis.mappingandjoining.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Projects_Table")
public class Projects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private Long id;
	
	private String name;
	
	private String manager;
	
	private String department;
	
	private Integer duration;
	
	@ManyToOne(cascade = CascadeType.ALL,targetEntity = Employee.class,fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
	private Employee employee;

	public Projects() {
		super();
	}

	public Projects(Long id, String name, String manager, String department, Integer duration,
			Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
		this.department = department;
		this.duration = duration;
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
