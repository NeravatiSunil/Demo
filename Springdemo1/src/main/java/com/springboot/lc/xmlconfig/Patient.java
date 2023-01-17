package com.springboot.lc.xmlconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
    //int method
	public void hi() {
		System.out.println("Inside hi method");
	}
	//destroy method
	public void bye()
	{
		System.out.println("Inside Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
	//init method with interfaces
	@Override
	public void afterPropertiesSet() throws Exception {
    		System.out.println("Inside after Property Set");
	}
    //Destroy method with interfaces
	@Override
	public void destroy() throws Exception {
     System.out.println("Inside destroy(");		
	}
	
	
}
