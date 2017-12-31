package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Message message1 = ctx.getBean("message", Message.class);
		message1.setMessage("Hello Radhe Krishna...!");
		message1.setMessageId(2714);

		System.out.println(message1.getMessageId() + "\t"
				+ message1.getMessage());
		
		System.out.println("===========================================");
		
		Message message2 = ctx.getBean("message", Message.class);
		
		System.out.println(message2.getMessageId() + "\t"
				+ message2.getMessage());
		((AbstractApplicationContext)ctx).close();
	}

}
