package com.arrays;

//) WAP to find Sum and avg of all the marks from 10th class Student.
public class TestArrDemo4 {

	public static void main(String[] args) {

		int[] n = {};
		System.out.println(n);// Address of the Array Object : [I@2b2fa4f7

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		System.out.println(marks);// [I@1dbd16a6

		double sum = 0;
		double avg = 0;
		
		for(int m:marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;

		System.out.println("Total Marks : " + sum);
		System.out.println("Avg of all marks : " + avg);

	}

}
