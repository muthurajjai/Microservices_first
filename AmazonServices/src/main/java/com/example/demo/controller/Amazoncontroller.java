package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Amazonproduct;
import com.example.demo.repository.Amazonrepository;
import com.example.demo.service.Proxyservice;

@RestController
@RequestMapping("/aws")
public class Amazoncontroller {

	@Autowired
	private Amazonrepository awsrepo;
	@Autowired
	private Proxyservice prox;
	
	@GetMapping("/amazonproduct")
	public List<Amazonproduct> findall()
	{
	
		return awsrepo.findAll();
	}
	
	@GetMapping("/getall")
	void addproduct()
	{
		
	List<Amazonproduct>	p=prox.findproducts();
	
	for(Amazonproduct product:p )
	{
		Amazonproduct amz=new Amazonproduct();
		amz.setProductname(product.getProductname());
		amz.setProductid(product.getProductid());
		amz.setPrice(product.getPrice()+100);
		
		awsrepo.save(amz);
	}
	
	}
	
	
}
