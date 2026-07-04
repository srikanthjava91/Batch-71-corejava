package com.exceptionhandling;

import java.util.Scanner;

//try catch finally 
public class TestExDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Just enter a number ");
		int n = sc.nextInt();// 5

		try {
			System.out.println("in try ");
			System.out.println(10 / 0);
			System.out.println("Hello");
			return;
		} catch (Exception e) {
			System.err.println("in catch ");
		} finally {
			System.out.println("in finally");
			sc.close();
		}

		System.out.println("main method ended ");
	}
}
