package com.spring.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.spring.dao.ProductDAO;
import com.spring.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Object object) {
		String sql = "insert into product_details values(?,?,?,?)";
		Product tempProduct = (Product) object;
		return this.jdbcTemplate.update(sql,tempProduct.getProductId(),tempProduct.getPruductName(),tempProduct.getDescription(),tempProduct.getUnitPrice());
	}

	@Override
	public List<Object> list() {
		String sql="select * from product_details";
		return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper(Product.class));
	}

}
