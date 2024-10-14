package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//registerShutdownHook present in AbstractApplicationContext
		context.registerShutdownHook();
		
		//Lifecycle Using xml
//		Samosa s=(Samosa)context.getBean("s1");
//		System.out.println(s);
		
		//Lifecycle using Interface
//		Pepsi p1=(Pepsi) context.getBean("p1");
//		System.out.println(p1);
		
		//Lifecycle using Annotations
		Example example=(Example)context.getBean("e1");
		System.out.println(example);
	}

}
