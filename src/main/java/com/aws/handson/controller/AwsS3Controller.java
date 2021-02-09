package com.aws.handson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.s3.model.Bucket;
import com.aws.handson.services.AmazonS3Service;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/s3")
public class AwsS3Controller {
	
    final static String CREATE_USAGE = "\n" +
            "CreateBucket - create an S3 bucket\n\n" +
            "Usage: CreateBucket <bucketName>\n\n" +
            "Where:\n" +
            "  bucketname - the name of the bucket to create.\n\n" +
            "The bucket name must be unique, or an error will result.\n";
	
	@Autowired
	AmazonS3Service amazonS3Service;
	
	@ApiOperation(value = CREATE_USAGE)
	@GetMapping("/createBucket/{bucketName}")
	public String createBucket(@PathVariable String bucketName) {
		return amazonS3Service.createBucket(bucketName);
	}
	
	@ApiOperation(value = "list all the buckets")
	@GetMapping("/listBuckets")
	public List<Bucket> createBucket() {
		return amazonS3Service.listBuckets();
	}

}
