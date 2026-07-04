package com.arrys2;

//WAP to find TotalMarks + avg of 10th class student marks ..? 
//99 98 97 96 95 94 
public class Student {

	void main() {
		System.out.println("welcome to Vcube !!");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double total_marks = 0;
		double avg = 0;
		
		for(int m:marks) {
			total_marks +=  m;
		}
		avg = total_marks/marks.length;

		System.out.println("Total Marks of the Student : " + total_marks);
		System.out.println("avg marks of the Student  " + avg);
	}
}
