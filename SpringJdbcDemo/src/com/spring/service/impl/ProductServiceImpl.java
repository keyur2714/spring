package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductDAO;
import com.spring.model.Product;
import com.spring.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public int save(Object object) {
		int result = 0;
		if (object instanceof Product) {
			result = productDAO.save(object);	
		}		
		return result;
	}

	@Override
	public List<Object> list() {
		return productDAO.list();
	}

}
