package com.springboot.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
         ApplicationContext ctx=new ClassPathXmlApplicationContext("config3.xml");
        Customer cs= (Customer) ctx.getBean("customer");
       /* System.out.println(cs.getModels().getClass());
        System.out.println(cs.getModels());
        System.out.println(cs.getName());*/
        System.out.println(cs.toString());
	}

}
