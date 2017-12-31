package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("27")
	private int studentId;
	
	@Value("Keyur")
	private String studentName;
	
	@Value("7387029671")
	private Long phone;
	
	@Autowired
	private Address address;

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
