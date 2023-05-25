package com.project.crudapis.mappingandjoining.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Address_Table")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Long id;
	private String addressType;
	private Integer houseNo;
	private String street;
	private String Area;
	private Long pincode;
	private String State;
	private String country;
	
//	@ManyToOne(mappedBy = "address")
//	@JoinColumn(name = "fk_address_id", referencedColumnName = "address_id")
//	private Employee employee;
	
	public Address() {
		super();
	}

	public Address(Long id, String addressType, Integer houseNo, String street, String area, Long pincode, String state,
			String country) {
		super();
		this.id = id;
		this.addressType = addressType;
		this.houseNo = houseNo;
		this.street = street;
		Area = area;
		this.pincode = pincode;
		State = state;
		this.country = country;
	//	this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Integer getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	
	

}
