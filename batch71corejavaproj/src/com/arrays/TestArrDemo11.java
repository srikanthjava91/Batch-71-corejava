package com.arrays;

import java.util.Scanner;

//Q) WAP to find the Frequency count  for given number from a Given array ..?
public class TestArrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find ");
		int search = sc.nextInt();// 18

		int count = 0;

		int[] arr = { 10, 9, 18, 7, 6, 5, 15, 16, 18, 18, 15, 18, 18, 18, 18, 18, 18, 18, 1, 18, 181, 181, 18, 181, 81,
				18, 18 };

		for (int a : arr) {
			if (a == search) {
				count++;
			}
		}

		System.out.println("The frequency count of Given is : " + count);

	}

}
