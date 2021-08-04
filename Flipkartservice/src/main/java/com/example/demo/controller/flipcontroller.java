package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.flipproxy.flipproxy;

import com.example.demo.model.Flipproduct;
import com.example.demo.repository.fliprepository;

@RestController
public class flipcontroller {

	@Autowired
	private flipproxy flipproxy;
	
	@Autowired
	private fliprepository fliprepo;
	
	@GetMapping("/getallproducts")
	void addproducts()
	{
		
	List<Flipproduct>	p=flipproxy.findproducts();
	
	for(Flipproduct product:p )
	{
		Flipproduct flip=new Flipproduct();
		flip.setProductname(product.getProductname());
		flip.setProductid(product.getProductid());
		flip.setPrice(product.getPrice()+500);
		
		fliprepo.save(flip);
	}
	
	}
	
	@GetMapping("/getflipproduct")
	List<Flipproduct> getall()
	{
		return fliprepo.findAll();
		
	}
	
	
	
}
