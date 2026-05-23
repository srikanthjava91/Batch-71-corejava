package com.arrays;

import java.util.Scanner;

//WAP to find Given element is Available in an array or not ..? 
public class TestArrDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search ");

		int search = sc.nextInt();// 9
		boolean status = false;

		int[] arr = { 10, 18, 7, 6, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				status = true;
				break;
			}
		}

		if (status) {
			System.out.println("The Given element found : ");
		} else {
			System.out.println("The Given element is not found : ");
		}

	}

}
