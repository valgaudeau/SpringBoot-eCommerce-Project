package com.springboot.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.eCommerce.model.Product;
import com.springboot.eCommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) // constructor DI
	{
		super();
		this.productRepository = productRepository;
	}
	
	@Override
	public List<Product> getAllProducts() { return productRepository.findAll(); }

	@Override
	public Product saveProduct(Product product) { return productRepository.save(product); }

	@Override
	public Product updateProduct(Product product) { return productRepository.save(product); }

	@Override
	public Product getProductById(Long id) { return productRepository.getById(id); }

	@Override
	public void deleteProductById(Long id) 
	{ 
		Product currProduct = productRepository.getById(id);
		currProduct.setActive(false);
		productRepository.deleteById(id); 
	}

}
