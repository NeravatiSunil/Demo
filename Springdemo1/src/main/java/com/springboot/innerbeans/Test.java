package com.springboot.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("config6.xml");
		Employee s = (Employee) ctx.getBean("employee");
		System.out.println(s.hashCode());
		Employee s1 = (Employee) ctx.getBean("employee");
		System.out.println(s1.hashCode());

		
		//Default Scope is singelton so it printing the same hashcode for both objects
		// If we change the scope to prototype in config xml the objects changes
	}

}
