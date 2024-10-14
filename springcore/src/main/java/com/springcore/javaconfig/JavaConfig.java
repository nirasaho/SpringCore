package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa=new Samosa();
		return samosa;
	}
	
	@Bean(name= {"student","temp","con"})
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}

}
