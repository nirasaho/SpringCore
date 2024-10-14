package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		//@Component annotation
//		Student student=context.getBean("firststudent",Student.class);
		
		//@Bean annotation
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		student.study();

	}

}
