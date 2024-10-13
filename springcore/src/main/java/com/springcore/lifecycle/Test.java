package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa s=(Samosa)context.getBean("s1");
		System.out.println(s);
		//registerShutdownHook present in AbstractApplicationContext
		context.registerShutdownHook();
	}

}
