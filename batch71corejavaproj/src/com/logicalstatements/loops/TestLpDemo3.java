package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to find sum of the all numbers..? 0 to 5
public class TestLpDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		System.out.println("sum is : " + sum);

	}

}
