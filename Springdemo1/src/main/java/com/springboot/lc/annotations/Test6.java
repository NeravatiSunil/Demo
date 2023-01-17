package com.springboot.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {

	public static void main(String args[]) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springboot/lc/annotations/config6.xml");
		// Student s=ctx.getBean(Student.class);

		Patient p = (Patient) ctx.getBean("patient");
		System.out.println(p);
		ctx.registerShutdownHook();
		

	}

}
