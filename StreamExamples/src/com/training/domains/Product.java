package com.training.domains;

public class Product {

	private long id;
	private String productName;
	private String brandName;
	private double ratePerUnit;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String productName, String brandName, double ratePerUnit) {
		super();
		this.id = id;
		this.productName = productName;
		this.brandName = brandName;
		this.ratePerUnit = ratePerUnit;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", brandName=" + brandName + ", ratePerUnit="
				+ ratePerUnit + "]";
	}
	
	
}
