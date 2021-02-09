package com.aws.handson.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfigBean {
	
	public static final Contact DEFAULT_CONTACT = new Contact("Shubham", "http://localhost:8080", "shubh.r0112@gmail.com");
	  public static final ApiInfo DEFAULT = new ApiInfo("AWS API Documentation", "AWS API Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "AWS SDK", "NO Licence", new ArrayList<>());

	@Bean
	public Docket getDocket() {
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT)
				.select().paths(p->p.contains("s3")).build();
	}

}
