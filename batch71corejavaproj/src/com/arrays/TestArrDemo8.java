package com.arrays;

//Q) WAP to find Maximum even number ..? 
public class TestArrDemo8 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int maxEven = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] > maxEven) {
				maxEven = arr[i];
			}
		}

		System.out.println("Maximum even number is : " + maxEven);

	}

}
