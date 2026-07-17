package com.dsa.searching;

import java.util.Scanner;

public class TestBinarySearchDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key to Search ");
		int key = sc.nextInt();// 30
		int index = binarySearch(arr, key);
		System.out.println("index of the Key : " + index);
	}

	private static int binarySearch(int[] arr, int key) {

		int low = 0;// 0
		int high = arr.length - 1;// 4

		while (low <= high) {

			int mid = low + (high - low) / 2;// 2

			if (arr[mid] == key) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return -1;
	}

}
