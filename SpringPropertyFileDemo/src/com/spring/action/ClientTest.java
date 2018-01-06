package com.spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Product;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Product product = applicationContext.getBean("product",Product.class);
		
		System.out.println(product.getPid()+" "+product.getProductName()+" "+product.getDescription()+" "+product.getUnitPrice());
		
	}

}
