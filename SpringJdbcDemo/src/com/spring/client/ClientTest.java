package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Product;
import com.spring.service.ProductService;
import com.spring.service.impl.ProductServiceImpl;

public class ClientTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Product product = new Product();
		
		product.setProductId(13);
		product.setPruductName("IPad");
		product.setDescription("Sony Ipad");
		product.setUnitPrice(11000);
		
		ProductService productService = applicationContext.getBean("productServiceImpl",ProductServiceImpl.class);
				
		int result = productService.save(product);
		if(result > 0) {
			System.out.println("Product Saved Successfully...");
		}
		
		List<Object> allProducts = productService.list();
		
		for (Object object : allProducts) {
			System.out.println(((Product)object).getProductId()+" "+((Product)object).getPruductName());
		}
		
		
		
	}

}
