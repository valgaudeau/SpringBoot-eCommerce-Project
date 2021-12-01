package com.springboot.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.eCommerce.model.Product;

/*  
 * Don't have to add @Repository annotation because the default implementation class of JpaRepository - 
 * SimpleJpaRepository - is already annotated with @Repository and @Transactional annotations.
 * To see this, hover over the class and shortcuts ctrl + T, which shows class hierarchy.
 */

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
