package com.example.demo.flipproxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Flipproduct;

@FeignClient(name="supplierservice", url="localhost:8081")
public interface flipproxy {
	@GetMapping("/api/products")
	List<Flipproduct> findproducts();
}
