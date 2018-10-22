package com.vasanthj.spring.springcoretraining.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/vasanthj/spring/springcoretraining/lc/xmlconfig.xml");
		Furniture furniture = (Furniture)ctx.getBean("furniture");
		System.out.println(furniture);
		ctx.registerShutdownHook();
	}

}







