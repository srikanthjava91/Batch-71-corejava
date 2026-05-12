package com.logicalstatements.loops;

//Q) WAP to find Factorial of a Given number using for loop..?
//input : number ex: 4 
//output : number ex: 24

import java.util.Scanner;

public class TestLPDemo5 {

	static int findFact(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = sc.nextInt();
		int f = findFact(n);
		System.out.println("Factorial of a Given number  : " + f);
	}
}
