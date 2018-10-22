package com.vasanthj.spring.springcoretraining.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Furniture implements InitializingBean, DisposableBean {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Furniture [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Init");
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside Destroy");
	}
	
}






