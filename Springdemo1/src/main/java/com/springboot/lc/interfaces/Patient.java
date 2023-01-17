package com.springboot.lc.interfaces;

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
	
	
}
