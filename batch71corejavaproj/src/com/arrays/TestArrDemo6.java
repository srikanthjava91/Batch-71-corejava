package com.arrays;

import java.util.Scanner;

// WAP to find min and max elements from an array ..? 
//input arr = {78, 65, -1, 67, -10, 98}
//output : max is 98 
//min is -10 
public class TestArrDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 3, 4, 1, 2 };

		int min = arr[0];// 3 1
		int max = arr[0];// 3 4

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			} else if (arr[i] < min) {
//				min = arr[i];
//			}
//		}

		for (int a : arr) {
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}

		System.out.println("Minimum value is : " + min);
		System.out.println("Maximum value is : " + max);

	}

}
