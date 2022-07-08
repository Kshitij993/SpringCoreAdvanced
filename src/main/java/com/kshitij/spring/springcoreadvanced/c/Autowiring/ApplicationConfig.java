package com.kshitij.spring.springcoreadvanced.c.Autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
//	@Bean(name="passport")
//	public Passport passport() {
//		return new Passport();
//	}
	
	@Bean(name="employee")
	public Employee employee() {
		return new Employee();
	}
}
