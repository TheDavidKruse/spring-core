package com.vasanthj.spring.springcoretraining.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/vasanthj/spring/springcoretraining/reftypes/config.xml");
		Car car = (Car)ctx.getBean("car");
		System.out.println(car);
	}

}




