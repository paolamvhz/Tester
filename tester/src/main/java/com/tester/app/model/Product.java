package com.tester.app.model;

public class Product {
	private int productid;
	private String name;
	private int categoryId;
	private String description;
	private String brand;
	private double price;
	private String dateTrend;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategoryid() {
		return categoryId;
	}
	public void setCategoryid(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDateTrend() {
		return dateTrend;
	}
	public void setDateTrend(String dateTrend) {
		this.dateTrend = dateTrend;
	}
	
	@Override
	public String toString() {
		return "name = "+name+ " categoryId ="+ categoryId + " decription= "
				+description+ " brand = "+brand+" price= "+price;
	}
	
}
