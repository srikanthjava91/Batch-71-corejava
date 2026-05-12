package com.logicalstatements.loops;

//WAP to print the numbers from 10 to 0 ..?
public class TestLpDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		for (int i = 10; i >= 0; i--) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
