package com.iqmsoft.springboot.jersey;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootJerseyDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new SpringBootJerseyDemoApplication()
				.configure(new SpringApplicationBuilder(SpringBootJerseyDemoApplication.class)).run(args);
	}
}
