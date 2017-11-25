package com.Spring;

public class Cricket implements GetDailyPractice{

	private GetDailyFortune thefortune;
	private String name;
	private int no;
	
	public Cricket (GetDailyFortune fortune) {
		
		thefortune = fortune;
	}
	
	@Override
	public String getDailyPractice() {
	
		return "Try hitting a six";
	}
	
	public String getThefortune() {
		return thefortune.getDailyFortune()+"For CRICKET";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	

}
