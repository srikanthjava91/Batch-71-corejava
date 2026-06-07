package com.arrays;

public class TestArrDemo21 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 4, 2, 3, 1, 5, 6, 7, 2, 3 };
		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;// 0 1 5

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

		System.out.println("After Sorting ");

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("main method ended ");
	}

}
