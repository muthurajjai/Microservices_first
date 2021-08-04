package com.example.demo.compareproxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.comparemodel;



@FeignClient(name="amazonservice", url="localhost:8085")
public interface compareproxy {

	
	@GetMapping("/aws/amazonproduct")
	List<comparemodel> findproducts();
	
}
