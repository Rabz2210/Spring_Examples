package com.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GetDailyPractice obj = context.getBean("baseball", GetDailyPractice.class);
		System.out.println(obj.getDailyPractice());
		System.out.println(obj.getThefortune());
		context.close();
	}

}
