package com.arrays;

//WAP to find sum and avg of 10th class students marks..?
public class Student {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double sum = 0;
		double avg= 0;

		for (int m : marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;

		System.out.println("Total Marks : " + sum);
		System.out.println("Avg of all marsk : " + avg);

		System.out.println("main method ended ");
	}

}
