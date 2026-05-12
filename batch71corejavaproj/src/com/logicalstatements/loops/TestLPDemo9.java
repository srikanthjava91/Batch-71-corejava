package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print the Given number is Perfect or not ..? 
//In number theory, a perfect number is a positive integer 
//that is "exactly equal to the sum of its positive divisors", 
//not counting the number itself. 
//For example, 6 is a perfect number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. 
//The next perfect number is 28, with divisors 1, 2, 4, 7, and 14, summing to 28. Other known perfect numbers include 496, 8128, and 33550336.
//input is : 10 --> 1 2 5 10 
//output : false 
public class TestLPDemo9 {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);

		if (flag) {
			System.out.println("The Given number is Perfect !!");
		} else {
			System.out.println("The Given number is Not a perfect");
		}

		sc.close();
		System.out.println("main method ended ");

	}

}
