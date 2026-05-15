package com.logicalstatements.loops;

import java.util.Scanner;

//The Given number & the Reverse number is same then we can consider as Palindrome..? 
//ex: 121 , 878, 939, 454, 141, 1221 , 13131
//
//WAP to find the Given number is Palindrome or not ..? 
//input : 567 
//output : false

//input : 565
//ouput : true 
public class TestLPDemo20 {

	static boolean isPalin(int n) {
		boolean status = false;
		int r = 0;
		int rev = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}

		if (rev == temp) {
			status = true;
		}

		return status;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		boolean status = isPalin(n);

		if (status) {
			System.out.println("The Given number is Palindrome");
		} else {
			System.out.println("The Given number is not a palindrome");
		}
		sc.close();
	}

}
