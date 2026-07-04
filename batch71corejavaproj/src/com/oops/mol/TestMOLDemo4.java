package com.oops.mol;

//WAP to find area of circle & Rectangle & Triangle 
//Circle : PI * r * r 
//Rectangle : Length * breadth
//Triangle  : 0.5 * base * height 

class A {
	
	void method1(int a, int b ) {
		System.out.println("Hello method1 ");
	}
}

class B  extends A {
	void method1(int a, float b ) {
		System.out.println("Welcome method1 ");
	}
}

public class TestMOLDemo4 {

	void main() {
		System.out.println("main method started ");
		System.out.println("Circle Area : " + findArea(5.6));
		System.out.println("Rectangle Area : " + findArea(100.5, 75.6));
		System.out.println("Traingle Area : " + findArea(5.5F, 7.9));
	}

	// Circle
	double findArea(double r) {
		return Math.PI * r * r;
	}

	// Rectangle
	double findArea(double l, double b) {
		return l * b;
	}

	// Triangle
	double findArea(float base, double height) {
		return 0.5 * base * height;
	}

}
