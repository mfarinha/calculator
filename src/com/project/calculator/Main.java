package com.project.calculator;

public class Main {

	public static void main(String[] args) {
		Convert convert = new Convert();
		convert.intToString(6);
		convert.stringToInt("5");
		
		System.out.println("String to int "+convert.getString());
		
		System.out.println("Int to string "+convert.getInt());

	}

}
