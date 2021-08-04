package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.enity.Product;
import com.example.repository.ProductRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class SupplierservicesApplication {
	 	
	
	public static void main(String[] args) {
		
		SpringApplication.run(SupplierservicesApplication.class, args);
	
		
	
		
	}



}
