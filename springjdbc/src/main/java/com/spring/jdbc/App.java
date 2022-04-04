package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started......!" );
        // spring jdbc -> JdbcTemplate
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);

        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        // insert
        
//        Student student = new Student();
//        student.setId(666);
//        student.setName("John");
//        student.setCity("Delhi");
//        
//        int result = studentDao.insert(student);
//        System.out.println("student added "+result);
        
        
        
        // update
        
//        Student student = new Student();
//        student.setId(245);
//        student.setName("Raj kumar");
//        student.setCity("Laknow");
//        
//        int result = studentDao.change(student);
//        System.out.println("Data changed "+result);
//        
//        
//        
        
        // delete

//        int result = studentDao.delete(666);
//        System.out.println("Deleted "+result);
        
        // single data using rowMapper
//        Student student = studentDao.getStudent(222);
//        System.out.println(student);
        
        // select multiple data using rowMapper
        List<Student> allStudent = studentDao.getAllStudent();
        for(Student s:allStudent)
        {
        	System.out.println(s);
        }
    }
}
