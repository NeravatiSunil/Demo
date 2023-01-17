package com.springboot.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
         ApplicationContext ctx=new ClassPathXmlApplicationContext("config2.xml");
        Car cs= (Car) ctx.getBean("car");
        System.out.println(cs.getModels().getClass());
        System.out.println(cs.getModels());
        System.out.println(cs.getName());
	}

}
