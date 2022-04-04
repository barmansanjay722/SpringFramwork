package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")   // remove this if using 
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name = {"student","temp","con"})
	public Student getStudent() {
		
		// creating new student object
		Student student = new Student(getSamosa());
		 
		return student;
	}
}
