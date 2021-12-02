package com.springboot.eCommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.eCommerce.model.Product;

/*  
 * Don't have to add @Repository annotation because the default implementation class of JpaRepository - 
 * SimpleJpaRepository - is already annotated with @Repository and @Transactional annotations.
 * To see this, hover over the class and shortcuts ctrl + T, which shows class hierarchy.
 */

public interface ProductRepository extends JpaRepository<Product, Long>
{
	// annotation needed to write JPQL. See https://www.tutorialspoint.com/jpa/jpa_jpql.htm and https://www.educba.com/jpql/
	// the ?1 refers to the first argument of the method associated with this category - int categoryId here
	
	 //	@Query("SELECT p FROM Product p WHERE p.category_id=?1 AND p.active=true") 
	 public List<Product> getAllActiveProductsByCategory(int categoryId);
}
