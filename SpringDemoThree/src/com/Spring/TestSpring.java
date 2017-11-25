package com.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cricket obj = context.getBean("cC", Cricket.class);
		System.out.println(obj.getDailyPractice());
		System.out.println(obj.getThefortune());
		System.out.println(obj.getName());
		context.close();
	}

}
