package com.vasanthj.spring.springcoretraining.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springcoretraining/dependencycheck/config.xml");
		CheckingAccount account = (CheckingAccount) ctx.getBean("account");
		System.out.println(account);
	}

}
