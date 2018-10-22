package com.vasanthj.spring.springcoretraining.reftypes;

public class Car {

	private Parts parts;

	public Parts getParts() {
		return parts;
	}

	public void setParts(Parts parts) {
		this.parts = parts;
	}

	@Override
	public String toString() {
		return "Car [parts=" + parts + "]";
	}
	
}
