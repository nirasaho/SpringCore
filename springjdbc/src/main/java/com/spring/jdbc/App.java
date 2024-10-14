package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        //Without using XML
//        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
        //INSERT
        
//        Student student=new Student();
//        student.setId(134);
//        student.setName("Baba");
//        student.setCity("jspur");
//        int result=studentDao.insert(student);
//        System.out.println("Insert done for student : "+result);
        
        //UPDATE
        
//        Student student=new Student();
//        student.setName("MAMA");
//        student.setCity("paradeep");
//        student.setId(123);
//        int result = studentDao.change(student);
//        System.out.println("Update completed with reesult : "+result);
        
        //DELETE
        
//        int result = studentDao.delete(456);
//        System.out.println("Delete completed with reesult : "+result);
        
        //SELECT by id
        Student student1 = studentDao.getStudent(111);
        System.out.println("Student details: : "+student1);
        
        //SELECT ALL
        List<Student> students = studentDao.getAllStudent();
        for(Student s:students) {
        	System.out.println("Student details: : "+s);
        }
        
        
    }
}
