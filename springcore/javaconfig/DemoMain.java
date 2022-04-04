package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student = context.getBean("firststudent",Student.class);
//		for bean annotation here is change
		Student student = context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.study();
	}

}
