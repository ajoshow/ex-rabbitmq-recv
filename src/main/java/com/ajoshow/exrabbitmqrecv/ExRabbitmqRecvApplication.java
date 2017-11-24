package com.ajoshow.exrabbitmqrecv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExRabbitmqRecvApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExRabbitmqRecvApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ExRabbitmqRecvApplication.class, args);
	}
}
