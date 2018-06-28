package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestParam;

public class BeanClass {
	
private int empId;
private double empSal;

private BeanClass2 comp;

public BeanClass2 getComp() {
	return comp;
}
public void setComp(BeanClass2 comp) {
	this.comp = comp;
}
public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
	
}

@Override
public String toString() {
	return "BeanClass [empId=" + empId + ", empSal=" + empSal + ", comp=" + comp + "]";
}
public String sampleTest(String empName)
{
    return empName+"hello Spring";

}
}
