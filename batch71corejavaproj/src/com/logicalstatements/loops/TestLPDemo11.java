package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Factorial of a Given number using Recursion..?
//fact of 4 --> 24 
//fact of 5 --> 120 
public class TestLPDemo11 {

	static int findFact(int n) {

		if (n == 1) {
			return 1;
		}

		return n * findFact(n - 1);
	}

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int fact = findFact(n);
		System.out.println("Factorial of a Given number is : " + fact);
		sc.close();

	}

}
