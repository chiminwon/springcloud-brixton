package com.ming.springcloud;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.ming.springcloud.filter.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class BrixtonEurekaApiGatewayApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BrixtonEurekaApiGatewayApp.class).web(true).run(args);
	}
	
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}
