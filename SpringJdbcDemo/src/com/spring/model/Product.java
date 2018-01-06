package com.spring.model;

public class Product {

	private int productId;
	private String pruductName;
	private String description;
	private int unitPrice;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPruductName() {
		return pruductName;
	}

	public void setPruductName(String pruductName) {
		this.pruductName = pruductName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
