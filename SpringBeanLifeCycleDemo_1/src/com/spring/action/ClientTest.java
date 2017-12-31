package com.spring.action;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = ctx.getBean("student", Student.class);
		if(student != null){
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getPhone());
		}
		ctx.close();
	}

}
