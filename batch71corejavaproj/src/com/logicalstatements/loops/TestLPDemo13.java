package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Prime numbers from a Given Range ..? 
//The prime numbers between 1 and 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
//What Are Prime Numbers?
//A prime number is a natural number greater than 1 
//that has exactly two distinct positive divisors: 1 and itself. 
//Numbers with more than two divisors are called composite numbers, 
//while the number 1 is neither prime nor composite. 
//For example, 5 is prime because it can only be divided evenly by 1 and 5, 
//whereas 6 is composite because it can be divided by 1, 2, 3, and 6
public class TestLPDemo13 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for range of Prime numbers from 0:  ");
		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}

	}

}
