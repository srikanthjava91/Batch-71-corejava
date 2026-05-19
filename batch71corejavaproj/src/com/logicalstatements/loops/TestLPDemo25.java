package com.logicalstatements.loops;

//Q) WAP to work with break & continue ..?
public class TestLPDemo25 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
