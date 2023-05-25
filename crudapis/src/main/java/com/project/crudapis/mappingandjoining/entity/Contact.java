package com.project.crudapis.mappingandjoining.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Contact_Table")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_id")
	private Long id;
	
	@Column(name = "Office.No", unique = true, nullable = false, length = 10)
	private Long phone1;
	
	@Column(name = "Personal.No", unique = true, nullable = false, length = 10)
	private Long phone2;
	
	@Column(name = "Emergency.No", unique = true, nullable = false, length = 10)
	private Long emergency;
	
	
	public Contact() {
		super();
	}

	public Contact(Long id, Long phone1, Long phone2, Long emergency) {
		
		this.id = id;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.emergency = emergency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPhone1() {
		return phone1;
	}

	public void setPhone1(Long phone1) {
		this.phone1 = phone1;
	}

	public Long getPhone2() {
		return phone2;
	}

	public void setPhone2(Long phone2) {
		this.phone2 = phone2;
	}

	public Long getEmergency() {
		return emergency;
	}

	public void setEmergency(Long emergency) {
		this.emergency = emergency;
	}
	
	

}
