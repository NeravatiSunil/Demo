package com.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
     ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
     Employee emp=(Employee) ctx.getBean("emp");
       System.out.println(emp.getId());
         
	}

}
