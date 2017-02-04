package com.project.calculator;

public class Convert {
	
	private String stringNumber = "";
	private int intNumber = 0;
	
	public void stringToInt(String number){
		this.intNumber = Integer.parseInt(number);
		
	}
	public void intToString(int number){
		this.stringNumber = String.valueOf(number);
		
	}
	public int getInt(){
		return this.intNumber;
	}
	public String getString(){
		return this.stringNumber;
	}
	
}
