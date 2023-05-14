package com.project.crudapis.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "person")
@Table(name = "person_info")
public class PersonModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "name", length = 25)
	private String name;
	
	@Column(name = "phone")
	private Long phone;
	
	@Column(name = "address")
	private String address;

//	public PersonModel(Integer id, String name, Long phone, String address) {
//		this.id = id;
//		this.name = name;
//		this.phone = phone;
//		this.address = address;
//	}

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

//	public PersonModel() {
//		super();
//	}

	@Override
	public String toString() {
		return "PersonModel [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
