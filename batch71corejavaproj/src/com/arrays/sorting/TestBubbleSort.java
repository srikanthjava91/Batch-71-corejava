package com.arrays.sorting;

public class TestBubbleSort {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 3 };
		int temp = 0;

		System.out.println("*****************");
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}

		}

		System.out.println("*****************");
		System.out.println("After SOrtig ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
