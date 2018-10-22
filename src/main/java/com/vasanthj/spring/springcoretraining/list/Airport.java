package com.vasanthj.spring.springcoretraining.list;

import java.util.List;

public class Airport {

	private String name;
	private List<String> airlines;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<String> airlines) {
		this.airlines = airlines;
	}

}


