package com.example.demo.compareproxy;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.comparemodel;


@FeignClient(name="flipkartservices", url="localhost:8086")
public interface compareproxyflip {

	

	
	@GetMapping("/getflipproduct")
	List<comparemodel> findproducts();
	
	
}
