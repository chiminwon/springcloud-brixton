package com.ming.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ComputeService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="addSeriveFallback")
	public String addService(){
		return restTemplate.getForEntity("http://BRIXTON-COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
	}
	
	public String addSeriveFallback(){
		return "service error";
	}
}
