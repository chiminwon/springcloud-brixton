package com.ming.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BrixtonConfigClientApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BrixtonConfigClientApp.class).web(true).run(args);
	}

}
