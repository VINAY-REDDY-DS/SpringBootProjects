package com.project.StudentManagementSystem.entity;

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

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Student_Table")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id",nullable = false)
	private Long id;
	
	@Column(name = "Student_name",nullable = false)
	private String name;
	
	@Column(name = "Student_branch", nullable = false)
	private String branch;
	
	@ManyToOne(targetEntity = College.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_clg_id", referencedColumnName = "College_id")
	@JsonBackReference
	private College college;

	public Student() {
		super();
	}

	public Student(Long id, String name, String branch, College college) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
	
	

}
