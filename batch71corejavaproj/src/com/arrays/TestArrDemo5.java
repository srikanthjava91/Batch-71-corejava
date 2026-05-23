package com.arrays;

//WAP to print Array in Reverse Order..? 
// 10 15 17 21 33 56 ---> 0 1 2 3 4 5
// 56 33 21 17 15 10 --> 5 4 3 2 1 0 

public class TestArrDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// 0 1 2 3 4 5
		int[] arr = { 10, 20, 30, 40, 50, 60 };

		// 5 4 3 2 1 0
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("main method ended ");
	}

}
