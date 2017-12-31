package com.spring.model;

public class Student {

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

	public void init() throws Exception {
		System.out.println("Bean is going through init() method...");
	}

	public void destroy() throws Exception {
		System.out.println("Bean is going through destroy() method..");
	}
}
