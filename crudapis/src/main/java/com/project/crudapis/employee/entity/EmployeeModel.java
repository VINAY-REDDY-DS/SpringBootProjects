package com.project.crudapis.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name = "employee")
@Table(name = "employee_info")
public class EmployeeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_phone")
	private Long phone;
	
	@Column(name = "emp_address")
	private String address;
	
	@OneToOne(targetEntity = DepartmentModel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "fk_dpt_id")
	private DepartmentModel department;

	public EmployeeModel(Integer id, String name, Long phone, String address, DepartmentModel department) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public DepartmentModel getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}

	public EmployeeModel() {
		super();
	}
	
	

}
