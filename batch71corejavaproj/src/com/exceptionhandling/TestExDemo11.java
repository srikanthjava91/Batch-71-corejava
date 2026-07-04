package com.exceptionhandling;

public class TestExDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try ");
//			System.out.println(10/ 0);//AE
//			System.out.println(0 / 0);//AE
//			System.out.println(10.5 / 0);//Infinity
			System.out.println(0.0 / 0);//NaN
		} catch (Exception e) {
			System.err.println("in catch");
			e.printStackTrace();
		}

		System.out.println("main method ended ");

	}

}
