package com.arrays;

//Q) WAP to find the Duplicate elements from a Given Array ..? 
//BruteForce methodology (Time Complexity  : O(n^2), Space Complexity : O(1))
public class TestArrDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, 2, 3, 4, 1, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) { // arr[0]== arr[1] ==arr[2] == arr[3]==arr[4]==arr[5]
					System.out.println(arr[i]);
				}
			}
		}

	}

}
