package com.nitinjyoti.product;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	public static ArrayList<ProductBean> productist = null; 
	public static int counter = 0;
	
	public ProductDAO() {
		init();
	}
	
	// Save operation
	public void save(ProductBean productBean) {
		String productid= "PROD"+getSeq();
		productBean.setProdcutid(productid);
		productist.add(productBean);
	}

	// Update operation	
	public void update(ProductBean productBean) {
		for(int i=0; i < productist.size(); i++) {
			if(productist.get(i).getProdcutid().equals(productBean.getProdcutid())) {
				productist.remove(i);
				productist.add(i, productBean);
			}
		}
	}
	
	// Delete operation
	public void delete(String productid) {
		for(int i=0; i < productist.size();i++) {
			if(productist.get(i).getProdcutid().equals(productid)) {
				productist.remove(i);
			}
		}
	}

	// get operation
	public ProductBean getProduct(String productid) {
		for(int i=0; i < productist.size();i++) {
			if(productist.get(i).getProdcutid().equals(productid)) {
				return  productist.get(i);
			}
		}		
		return null;
	}

	// List operation
	public ArrayList<ProductBean> List() {
		return productist;
	}

	// Dummy Data 
	public static void init() {
		productist = new ArrayList<>(
				Arrays.asList(
						new ProductBean("PROD"+getSeq(),10000, "nokia", "mobile"),
						new ProductBean("PROD"+getSeq(),12000, "samsung", "mobile"),
						new ProductBean("PROD"+getSeq(),8000, "Lava", "mobile"),
						new ProductBean("PROD"+getSeq(),5000, "Fyi", "mobile"),
						new ProductBean("PROD"+getSeq(),13000, "Bluebarray", "mobile"),
						new ProductBean("PROD"+getSeq(),30000, "apple", "mobile")
						)
				);	
	}
	
	// Sequence Function
	public static int getSeq() {
		counter++;
		return counter;
	}
	
	
}
