package com.Spring;

import org.springframework.stereotype.Component;

@Component("weeklyfortune")
public class WeeklyFortune implements GetDailyFortune {

	@Override
	public String getDailyFortune() {
	
		return "today is your un-lucky day";
	}

}
