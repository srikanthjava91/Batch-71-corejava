package com.oops.mol;

public class TestMOLDemo5 {

	void main(String... args) {
		System.out.println("main method started ");
		
//		int ... args = new int[5];not valid
		addition("");
		addition("", 10);
		addition("", 10, 20);
		addition("", 10, 20, 30);
		addition("", 10, 20, 30, 40);
		addition("", 10, 20, 30, 40, 50);
		addition("", 10, 20, 30, 40, 50, 60);
		addition("", 10, 20, 30, 40, 50, 60, 70);
//		add(10);

	}

	// var arg method --> var arg interna lly works like a Array of elements
//	var arg must be the last argument in a method.
//	CE : The variable argument type int of the method addition must be the last parameter
	void addition(String s, int... args) {
		System.out.println("Addition method called ");
		int sum = 0;
		for (int a : args) {
			sum = sum + a;
		}

		System.out.println("sum of all values: " + sum);

	}

//	void add(int[] arr) {
//		
//	}

}
