package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) 
	{
		//run(...) return configurableApplicatinContext that is configuration, so reveive that 

		ConfigurableApplicationContext context = SpringApplication.run(HelloApplication.class, args);

		//use those context to create object
		Home h = context.getBean(Home.class,args);
		h.connect();
		Home h2 = context.getBean(Home.class,args);
		// i want create object on constructor "Home h = context.getBean(Home.class,args);" --> this is object creation so now i have constructor crate the object those construtor
	}

}
