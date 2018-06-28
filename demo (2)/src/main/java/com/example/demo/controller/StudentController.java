package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StudentBeanReq;
import com.example.demo.service.StudentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@ApiResponses(value=@ApiResponse(code=403,message="this is not working"))
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@ApiOperation(value="this api is used for insert the data")
	
	@PostMapping("student")
	public StudentBeanReq studentInfom(StudentBeanReq studentbeanreq)
	
	{
		return studentservice.studentInfom(studentbeanreq);
	}
	

}
