package com.arrays;

//WAP to Represent 2D array using {} 
public class TestArrDemo15 {

	public static void main(String[] args) {

		int[][] numbers = { { 10, 20, 30 }, { 50, 60 }, { 70, 80, 90, 100 } };
		System.out.println(numbers);

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();

		}

//		for(int[] n1:numbers) {
//			for(int number:n1) {
//				System.out.print(number  + " ");
//			}
//			System.out.println();
//		}
	}
}
