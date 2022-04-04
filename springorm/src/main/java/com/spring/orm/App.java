package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =	new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//    	Student student = new Student(2324,"Durgesh","lucknow");
//    	
//    	int r = studentDao.insert(student);
//    	System.out.println("done "+r);
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println("PRESS 1 FOR ADD NEW STUDENT");
    	System.out.println("PRESS 2 FOR display all STUDENT");
    	System.out.println("PRESS 3 FOR display single STUDENT");
    	System.out.println("PRESS 4 FOR delete STUDENT");
    	System.out.println("PRESS 5 FOR update STUDENT");
    	System.out.println("PRESS 6 for exit ");
    }
}
