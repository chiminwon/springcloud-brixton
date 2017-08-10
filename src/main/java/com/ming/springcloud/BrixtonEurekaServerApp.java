package com.ming.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BrixtonEurekaServerApp {

	public static void main(String[] args){
		new  SpringApplicationBuilder(BrixtonEurekaServerApp.class).web(true).run(args);
	}
}
