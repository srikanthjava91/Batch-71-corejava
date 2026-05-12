package com.logicalstatements.loops;

//one time 
//infinite 
//10 time 
//WAP to print Hello for 10 times with values from 10 to 20..?
public class TestLpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		for (int i = 10; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Hello :" + i);
			}
		}
	}
}
