package com.springboot.constructorinjection.ambiguity;

public class Addition {

	Addition(double a, double b) {
		System.out.println("Inside constructor double");
	}

	Addition(int a, int b) {
		System.out.println("Inside constructor int");
	}
	Addition(int a,double b) {
		System.out.println("Inside constructor String");
		System.out.println(b);
		System.out.println(a);
	}
}
