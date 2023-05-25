package com.project.StudentManagementSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "University_Table")
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	private Long id;
	
	@Column(name = "university_name",nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "university",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<College> college;

	public University() {
		super();
	}

	public University(Long id, String name, List<College> college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
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

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}
	
	

}
