package com.springboot.eCommerce.service;

import java.util.List;

//import org.springframework.data.domain.Sort;

import com.springboot.eCommerce.model.Product;

public interface ProductService 
{
	List<Product> getAllProducts();
	
	List<Product> getAllActiveProducts();
	
	List<Product> getAllActiveProductsByCategory(int categoryId);
	
	Product saveProduct(Product product);
	
	Product updateProduct(Product product);
	
	Product getProductById(Long id);
	
	void deleteProductById(Long id);

}
