package com.aws.handson.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;

@Service
public class AmazonS3Service {
	
	@Autowired
	AmazonS3 amazonS3;
	
	public String createBucket(String bucketName) {
		if(amazonS3.doesBucketExistV2(bucketName)) {
			return "bucket already Exist";
		} else {
			return amazonS3.createBucket(bucketName).getName();
		}
	}
	
	public List<Bucket> listBuckets() {
		return amazonS3.listBuckets();
	}

}
