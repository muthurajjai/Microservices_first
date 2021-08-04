package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enity.Product;
import com.example.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository prorepo;
	
	@GetMapping("api/products")
	List<Product> getallproduct()
	{
		System.out.println("hi");
		return prorepo.findAll();
	}
	@GetMapping("/test")
	String test()
	{
		
	return "hello world";
		
	}

	
}
