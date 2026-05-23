package com.arrays;

import java.util.Scanner;

//Q) WAP to Read the elements from Scanner for int and representing Prime numbers from given array of elements.
public class TestArrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();

		int[] numbers = new int[size];// 5 --> 0 1 2 3 4

		System.out.println("Read the elements from Console ");

		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println("Represent an Array for prime numbers");

		for (int i = 0; i < size; i++) {
			if (isPrime(numbers[i])) {
				System.out.print(numbers[i] + " ");
			}
		}

	}

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

}
