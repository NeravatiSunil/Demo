package com.springboot.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
         ApplicationContext ctx=new ClassPathXmlApplicationContext("config1.xml");
        Hospital hsp= (Hospital) ctx.getBean("hospital");
        System.out.println(hsp.getDepartments().getClass());
        System.out.println(hsp.getDepartments());
        System.out.println(hsp.getName());
	}

}
