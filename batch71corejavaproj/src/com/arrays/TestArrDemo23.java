package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo23 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times you want to Rotate ..?");
		int r = sc.nextInt();

		rotateArray(arr, r);
		System.out.println("After Rotation ");

		System.out.println(Arrays.toString(arr));

		System.out.println("main method ended ");
	}

	static void rotateArray(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;

		if (r < arr.length) {
//			Step1 :Total Array Reverse 
			reverseArray(arr, start, end);

//			Step2 : First half of Array Reverse 
			reverseArray(arr, start, r - 1);

//			Stpe3: Second Half of Array Reverse 
			reverseArray(arr, r, end);

		} else {
			System.err.println("Entered Rotation is Out of the Bounds, SO representing same array!");
		}

	}

	static void reverseArray(int[] arr, int start, int end) {

		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}
}
