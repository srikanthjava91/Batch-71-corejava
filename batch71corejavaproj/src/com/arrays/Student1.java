package com.arrays;

//WAP to find total_marks & avg of 10th class Student ..? 
//marks : 99 98 97 96 95 94
public class Student1 {

	void main() {
		System.out.println("Welcome to Vcube !!");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double total_marks = 0;
		double avg = 0;
		
		for(int m:marks) {
			total_marks = total_marks + m;
		}
		
		avg = total_marks/marks.length;

		System.out.println("Total marks : " + total_marks);
		System.out.println("Avg of all marks : " + avg);

	}

}
