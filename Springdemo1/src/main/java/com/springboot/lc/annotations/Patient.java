package com.springboot.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
    //int method
	@PostConstruct
	public void hi() {
		System.out.println("Inside hi method");
	}
	
	//All the annotations are defaultly disabled we have to enable them in config.xml
	
	//destroy method
	@PreDestroy
	public void bye()
	{
		System.out.println("Inside Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
