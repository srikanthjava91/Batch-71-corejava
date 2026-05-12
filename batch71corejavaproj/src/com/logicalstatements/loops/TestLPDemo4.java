package com.logicalstatements.loops;

//Q) WAP to print Multiplication of all the numbers..? 
//Q) WAP to print Factorial of a Given number using for loop ..? n!
//input : number ex: 4 
//output : number ex: 24

import java.util.Scanner;

public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");

		long n = sc.nextInt();
		long fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of a Given number : " + fact);

	}

}
