package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Amazonproduct;
import com.example.demo.repository.Amazonrepository;

@FeignClient(name="supplierservice", url="localhost:8081")
public interface Proxyservice {

	
	
	@GetMapping("/api/products")
	List<Amazonproduct> findproducts();
	
}
