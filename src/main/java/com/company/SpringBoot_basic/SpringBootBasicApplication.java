package com.company.SpringBoot_basic;

import com.company.SpringBoot_basic.model.Alien;
import com.company.SpringBoot_basic.model.Laptop;
import com.company.SpringBoot_basic.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringBootBasicApplication.class, args);

		LaptopService laptopService=context.getBean(LaptopService.class);
		Laptop laptop=context.getBean(Laptop.class);

		laptopService.addLaptop(laptop);

//		Alien obj=context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();

	}
}
