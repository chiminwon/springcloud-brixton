package com.ming.springcloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ComputeController {

	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	DiscoveryClient discoveryClient;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public Integer add(@RequestParam Integer a,@RequestParam Integer b){
		ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
		Integer c = a+b;
		logger.info("/add, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", result:" + c);
		return c;
	}
}
