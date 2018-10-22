package com.vasanthj.spring.springcoretraining.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Furniture {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public String toString() {
		return "Furniture [id=" + id + "]";
	}

}

