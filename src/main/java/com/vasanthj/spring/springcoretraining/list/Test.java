package com.vasanthj.spring.springcoretraining.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/vasanthj/spring/springcoretraining/list/listConfig.xml");
		Airport airport = (Airport)ctx.getBean("airport");
		for(String airline: airport.getAirlines()) {
			System.out.println(airline);
		}
	}

}




