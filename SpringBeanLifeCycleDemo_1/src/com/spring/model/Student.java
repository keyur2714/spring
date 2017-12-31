package com.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	
	private int studentId;
	private String studentName;
	private Long phone;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is going through afterPropertiesSet() method...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is going through destroy() method..");
	}
}
