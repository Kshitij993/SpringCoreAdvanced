package com.kshitij.spring.springcoreadvanced.c.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.kshitij.spring.springcoreadvanced.c.Autowiring")
public class Driver {
	public static void main(String[] args)  {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee e = context.getBean("employee",Employee.class);  
		System.out.println(e);
	}
}