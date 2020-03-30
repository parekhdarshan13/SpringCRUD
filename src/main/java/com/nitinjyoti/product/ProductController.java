package com.nitinjyoti.product;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired ProductDAO prodDAO;
	
	@CrossOrigin
	@RequestMapping(value = "/product", method = {RequestMethod.GET,RequestMethod.POST})
	public ArrayList<ProductBean> test() {
		return prodDAO.List();
	}

	@CrossOrigin
	@RequestMapping(value="/productAdd", method = {RequestMethod.GET,RequestMethod.POST})
	public void saveProduct(@RequestBody ProductBean productBean) {
		prodDAO.save(productBean);
	}
	
	@CrossOrigin
	@RequestMapping(value="/productUpdate", method = {RequestMethod.GET,RequestMethod.POST})
	public void updateProduct(@RequestBody ProductBean productBean) {
		prodDAO.update(productBean);
	}
	
	@CrossOrigin
	@RequestMapping(value="/productDelete/{productid}", method = {RequestMethod.GET,RequestMethod.POST})
	public void deleteProduct(@PathVariable String productid) {
		prodDAO.delete(productid);
	}

	@CrossOrigin
	@RequestMapping(value="/productGet/{productid}", method = {RequestMethod.GET,RequestMethod.POST})
	public ProductBean getProduct(@PathVariable String productid) {
		return prodDAO.getProduct(productid);
	}
	
}
