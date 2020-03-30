package com.nitinjyoti.product;

import org.springframework.stereotype.Component;

@Component
public class ProductBean {

	private String prodcutid;
	private int productPrice;
	private String productName;
	private String productCategory;
		
	public ProductBean() {
	}
	public String getProdcutid() {
		return prodcutid;
	}
	public void setProdcutid(String prodcutid) {
		this.prodcutid = prodcutid;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public ProductBean(String prodcutid,int productPrice, String productName, String productCategory) {
		this.prodcutid = prodcutid;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productCategory = productCategory;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
