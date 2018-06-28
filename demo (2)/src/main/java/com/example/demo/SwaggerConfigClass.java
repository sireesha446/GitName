package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@EnableSwagger2

public class SwaggerConfigClass {
	@Bean
	public Docket dbconfigSwagger()
	{
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")).paths(PathSelectors.any()).build().apiInfo(swaggerMetadata());
	}
	 private ApiInfo swaggerMetadata()
	 {
		 String title="db communication";
		 String description="any issue";
		 String version="1.0.SNOPSHOT";
		 String termsOfServiceUrl="";
		 String contact=""; 
		 String license="dru license";
		 String licenseUrl="www.licenseURl";
		 return new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl);
	 }
}