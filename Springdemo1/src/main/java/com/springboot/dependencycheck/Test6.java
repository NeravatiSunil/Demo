package com.springboot.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springboot/dependencycheck/config6.xml");
		// Student s=ctx.getBean(Student.class);

		Prescription p = (Prescription) ctx.getBean("prescription");
		System.out.println(p);
		
		

	}

}
