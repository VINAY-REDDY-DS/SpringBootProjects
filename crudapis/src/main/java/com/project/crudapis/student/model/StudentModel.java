package com.project.crudapis.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_info")

public class StudentModel {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "stu_id", nullable = false, length = 5)
		private Integer id;
		
		@Column(name = "stu_name", length = 25)
		private String name;
		
		@Column(name = "stu_email", length = 50)
		private String email;
		
		@Column(name = "stu_phone", length = 10)
		private Long phone;
		
		@Column(name = "stu_address", length = 100)
		private String address;
		
		@Column(name = "stu_pincode",length = 6)
		private Integer pincode;

		public StudentModel(Integer id, String name, String email, Long phone, String address, Integer pincode) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
			this.pincode = pincode;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
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

		public Integer getPincode() {
			return pincode;
		}

		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}

		@Override
		public String toString() {
			return "StudentModel [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
					+ address + ", pincode=" + pincode + "]";
		}

		public StudentModel() {
			super();
		}
		
		
		

}
