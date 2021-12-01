package com.springboot.eCommerce.service;

import java.util.List;

import com.springboot.eCommerce.model.Product;

public interface ProductService 
{
	List<Product> getAllProducts();
	
	Product saveProduct(Product product);
	
	Product updateProduct(Product product);
	
	Product getProductById(Long id);
	
	void deleteProductById(Long id);
}
