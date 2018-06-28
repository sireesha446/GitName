package com.example.demo;

public class BeanClass2 {
	private int CompanyId;
	private String companyName;
	
	public BeanClass2(int companyId, String companyName) {
		super();
		this.CompanyId = companyId;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "BeanClass2 [CompanyId=" + CompanyId + ", companyName=" + companyName + "]";
	}
	
	

}
