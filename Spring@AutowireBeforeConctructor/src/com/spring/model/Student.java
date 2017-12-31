package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int studentId;
	private String studentName;
	private Long phone;
	
	private Address address;

	@Autowired
	public Student(int studentId, String studentName, Long phone,Address address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.phone = phone;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Long getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}
}
