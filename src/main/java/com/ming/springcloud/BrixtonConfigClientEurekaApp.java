package com.ming.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BrixtonConfigClientEurekaApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BrixtonConfigClientEurekaApp.class).web(true).run(args);
	}

}
