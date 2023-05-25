package com.project.crudapis.mappingandjoining.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_mail")
	private String mail;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Contact.class,fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_contact_id", referencedColumnName = "contact_id")
	private Contact contact;
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Address.class,fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
	private List<Address> address;
	
	@OneToMany(mappedBy = "employee")
	private List<Projects> projects;

	public Employee() {
		super();
	}

	public Employee(Long id, String name, String mail, Contact contact ,List<Address> address, List<Projects> projects) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.contact = contact;
		this.address = address;
		this.projects = projects;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}
	
	
	
	

}
