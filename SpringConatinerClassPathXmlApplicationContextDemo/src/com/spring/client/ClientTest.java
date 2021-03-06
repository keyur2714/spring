package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Object bean = ctx.getBean("msg");
		if(bean != null){
			Message message = (Message)bean;
			System.out.println(message.getMessageId()+"\t"+message.getMessage());
		}
		
		((AbstractApplicationContext)ctx).close();
	}

}
