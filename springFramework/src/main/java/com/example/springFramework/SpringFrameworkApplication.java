package com.example.springFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {


		ApplicationContext ctx= SpringApplication.run(SpringFrameworkApplication.class, args);
		BinarySearch  obj=ctx.getBean(BinarySearch.class);
		obj.searchElement(5);
	}

}
