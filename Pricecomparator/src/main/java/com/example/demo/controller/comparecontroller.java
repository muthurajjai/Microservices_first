package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.compareproxy.compareproxy;
import com.example.demo.compareproxy.compareproxyflip;
import com.example.demo.model.comparemodel;

@RestController
public class comparecontroller {

	@Autowired
	private compareproxy awsproxy;
	@Autowired
	private compareproxyflip flipproxy;
	
	@GetMapping("/compareproducts")
	String compareproduct()
	{
		List<comparemodel> p1=awsproxy.findproducts();
		List<comparemodel> p2=flipproxy.findproducts();
		String result="";
		String str;
		for(comparemodel awsproduct:p1)
		{
			for(comparemodel flipproduct:p2) {
			if(awsproduct.getProductid()==flipproduct.getProductid())
			{
				
				str="Amazon="+awsproduct.getPrice()+"-----Flipkart="+flipproduct.getPrice();	
				result=result+str+"\n";
			}
			
			}
			
		}
		return result;
		
	}
	
	
	
}
