package com.springboot.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String args[]) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("config4.xml");
		CountriesandLanguages cl = (CountriesandLanguages) ctx.getBean("countriesAndLangs");
		System.out.println(cl.toString());

	}

}
