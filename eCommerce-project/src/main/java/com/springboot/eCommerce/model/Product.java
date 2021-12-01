package com.springboot.eCommerce.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String code;
	
	private String brand;
	
	private String Description;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="available_quantity")
	private int availableQuantity;
	
	private boolean active;
	
	@Column(name="category_id")
	private int categoryId;
	
	public Product(long id, String name, String code, String brand, String description, double unitPrice,
			int availableQuantity, boolean active, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.brand = brand;
		Description = description;
		this.unitPrice = unitPrice;
		this.availableQuantity = availableQuantity;
		this.active = active;
		this.categoryId = categoryId;
	}

	/*
	 * Adding no field constructor because Hibernate internally uses proxies to create objects dynamically
	 * Creating product code at the same time - for UUID see https://www.javatpoint.com/java-uuid
	 */
	Product()
	{
		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	public long getId() { return id; }
		
	public void setId(long id) { this.id = id; }
		
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getCode() { return code; }

	public void setCode(String code) { this.code = code; }
		
	public String getBrand() { return brand; }
		
	public void setBrand(String brand) { this.brand = brand; }
	
	public String getDescription() { return Description; }

	public void setDescription(String description) { Description = description; }

	public double getUnitPrice() { return unitPrice; }

	public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

	public int getAvailableQuantity() { return availableQuantity; }

	public void setAvailableQuantity(int availableQuantity) { this.availableQuantity = availableQuantity; }

	public boolean isActive() { return active; }

	public void setActive(boolean active) { this.active = active; }

	public int getCategoryId() { return categoryId; }

	public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
	
}
