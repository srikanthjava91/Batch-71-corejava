package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to find the count of digits from a Given number ...?
public class TestLPDemo22 {

	static int digitCount(int n) {
		int count = 0;

		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			count++;
		}

//		String cs = Integer.toString(n);
//		count = cs.length();

		return count;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int c = digitCount(n);
		System.out.println("Count of the given digits are : " + c);

		System.out.println("main method ended ");

	}

}
