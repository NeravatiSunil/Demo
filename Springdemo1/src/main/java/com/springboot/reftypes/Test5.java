package com.springboot.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config5.xml");
		// Student s=ctx.getBean(Student.class);

		Student s = (Student) ctx.getBean("student");
		System.out.println(s.toString());

	}

}
