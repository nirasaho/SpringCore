package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		B b=(B)context.getBean("bref");
		A a=(A)context.getBean("aref");
		System.out.println(b.getY());
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
		System.out.println(a);
	}

}
