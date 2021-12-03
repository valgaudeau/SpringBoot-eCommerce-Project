package com.springboot.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// EXCLUDING SECURITY CONFIGURATION FOR NOW SO I DONT GET AUTOMATIC LOGIN PAGE REDIRECT
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }) 
public class ECommerceProjectApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(ECommerceProjectApplication.class, args);
	}

}
