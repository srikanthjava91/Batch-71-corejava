package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		String s = null;
		try {
			System.out.println("in try ");
			System.out.println(s.length());// null . any operation is NPE

		} catch (NullPointerException e) {
			System.err.println("in catch ");
//			e.printStackTrace();// Name + Description + location 
//			System.err.println(e.getMessage());//Description
			System.err.println(e.toString());// Name + Description
		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
	}

}
