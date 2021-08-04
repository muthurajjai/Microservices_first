package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flipproduct {

	@Id
	private int productid;
	private String productname;
	private int price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Flipproduct(int productid, String productname, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
	}
	public Flipproduct() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", price=" + price + "]";
	}
	
	
}
