package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p=(Person)context.getBean("person");
		Person person1=(Person) context.getBean("person1");
		System.out.println(p);
		System.out.println(person1);
		
		//ambiguity
		Addition add=(Addition)context.getBean("addition");
		add.doSum();

	}

}
