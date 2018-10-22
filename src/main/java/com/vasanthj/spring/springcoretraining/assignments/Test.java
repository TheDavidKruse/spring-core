package com.vasanthj.spring.springcoretraining.assignments;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/vasanthj/spring/springcoretraining/assignments/config.xml");
		ShoppingCart shoppingCart = (ShoppingCart)ctx.getBean("shoppingCart");
		System.out.println(shoppingCart);
	}

}




