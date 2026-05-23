package com.arrays;

public class TestArrDemo3 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		int[] numbers = new int[3];// 0 1 2
		numbers[0] = 18;
		numbers[1] = 7;
		numbers[2] = 45;
		numbers[3] = 50;// ArrayIndexOutOfBoundsException

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
