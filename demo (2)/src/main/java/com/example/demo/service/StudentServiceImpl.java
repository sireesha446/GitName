package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.StudentBeanReq;
import com.example.demo.dao.StudentDao;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	StudentDao studentdao;


	@Override
	public StudentBeanReq studentInfom(StudentBeanReq studentbeanreq) {
		
		return studentdao.studentInform(studentbeanreq);
	}

}
