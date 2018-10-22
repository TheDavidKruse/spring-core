package com.vasanthj.spring.springcoretraining.constructorinjection.ambiguity;

public class Addition {

	public Addition(int a, double b) {
		System.out.println("inside the int constructor");
	}
	
	public Addition(double a, double b) {
		System.out.println("Inside the double constructor");
	}
	

}
