package com.vasanthj.spring.springcoretraining.lc.xmlconfig;

public class Furniture {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void init() {
		System.out.println("Inside Init");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy");
	}

	@Override
	public String toString() {
		return "Furniture [id=" + id + "]";
	}
	
}




