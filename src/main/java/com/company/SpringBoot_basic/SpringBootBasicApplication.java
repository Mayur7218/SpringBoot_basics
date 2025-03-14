package com.company.SpringBoot_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootBasicApplication.class, args);
		Alien obj=context.getBean(Alien.class);
		obj.code();

	}

}
