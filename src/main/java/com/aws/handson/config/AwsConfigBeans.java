package com.aws.handson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AwsConfigBeans {
	
	
	@Bean
	public AmazonS3 getAmazonS3() {
	       return AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
	}

	

}
