package com.springboot.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springboot/constructorinjection/ambiguity/config6.xml");
		// Student s=ctx.getBean(Student.class);

	Addition p = (Addition) ctx.getBean("addition");
		System.out.println(p);
		
		

	}

}
