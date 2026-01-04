package com.example.demo1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass
{
	@PostMapping("/Bjk")
	public String Firstmeth() 
	{
		
	 return"Sucess";	
	}
}
