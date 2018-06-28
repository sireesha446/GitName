package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.BeanClass;


public class MainSpringclass {
	
	@Autowired
	BeanClass b1;
	public String daoMethod()
	{
		return "hello"+b1.sampleTest("siri");
	}


		
		

	

}
