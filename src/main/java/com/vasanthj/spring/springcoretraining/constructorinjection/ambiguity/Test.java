package com.vasanthj.spring.springcoretraining.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springcoretraining/constructorinjection/ambiguity/config.xml");
		Addition addition = (Addition) ctx.getBean("addition");
	}

}
