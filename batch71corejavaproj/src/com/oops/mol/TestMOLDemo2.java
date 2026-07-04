package com.oops.mol;


//byte short int long float double 
public class TestMOLDemo2 {

	void main() {
		System.out.println("main method started ");
		addition();
		addition(10);
		addition(10, 20);//The method addition(int, float) is ambiguous for the type TestMOLDemo2
		addition(10.5F, 56.5F);
	}
	
	
	void addition(int f1, float f2) {
		System.out.println("Addition with one int onr float  : ");
		System.out.println(f1 + f2);
	}
	
	void addition(float f1, int f2) {
		System.out.println("Addition with one float onr int  : ");
		System.out.println(f1 + f2);
	}

	void addition() {
		System.out.println("Addition method called with no args");
	}

	void addition(int a) {
		System.out.println("Addition with one int arg called ");
		System.out.println(a + 100);
	}

	void addition(int a, int b) {
		System.out.println("Addition with two int args : ");
		System.out.println(a + b);
	}

	void addition(float f1, float f2) {
		System.out.println("Addition with two float arg : ");
		System.out.println(f1 + f2);
	}
//	
	void addition(double f1, double f2) {
		System.out.println("Addition with two double arg : ");
		System.out.println(f1 + f2);
	}

}
