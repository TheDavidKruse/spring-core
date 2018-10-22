package com.vasanthj.spring.springcoretraining.constructorinjection;

public class Employee {

	Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	private int id;
	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}

