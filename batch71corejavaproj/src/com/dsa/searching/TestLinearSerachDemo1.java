package com.dsa.searching;

import java.util.Scanner;

public class TestLinearSerachDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 40, 50, 10, 20, 30, 60 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to Search ");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		System.out.println("index of the Key : " + index);
		sc.close();
	}

	private static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		return -1;
	}
}
