package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("baseball")
public class baseBall implements GetDailyPractice{

	@Autowired
	@Qualifier("dailyfortune")
	private GetDailyFortune thefortune;

	
	
	public baseBall() {
		System.out.println("inside default constructor of baseball");
	}
	
	@Override
	public String getDailyPractice() {
		
		return "try hitting a home run";
	}

	public String getThefortune() {
		return thefortune.getDailyFortune()+"for Baseball";
	}

	


}
