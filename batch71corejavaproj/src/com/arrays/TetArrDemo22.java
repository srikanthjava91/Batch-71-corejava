package com.arrays;

//Q) WAP to print Array in Reverse Order using Swapping ..? 
public class TetArrDemo22 {

	public static void main(String[] args) {
		System.out.println("main method strated");

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		reverseArray(arr);

		System.out.println("After Reverse");

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("main method ended");

	}

	static void reverseArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

	}

}
