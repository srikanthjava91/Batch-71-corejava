package com.oops.mol;

public class TestMOLDemo3 {

	void main(String[] args) {
		System.out.println("main method started ");

		show("Srikanth");
//		show(null);//The method show(Integer) is ambiguous for the type TestMOLDemo3

	}
	
	void show(Integer in) {
		System.out.println(in);
	}

	void show(String str) {
		System.out.println("Hello " + str);
	}
	
	void show(Object str) {
		System.out.println("Welcome " + str);
	}

}
