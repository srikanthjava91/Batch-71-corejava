package com.languagefun.methods;

import java.util.Scanner;

//with return type + with arguments 
//WAP to calculate Areas of Triangle, Rectangle, Square and Circle ..?
//Area of Triangle : 0.5 * b * h
//Area of Rectangle : Length * breadth 
//Area of Square  : side * side 
//Area of Circle  : 3.14 * r * r  

public class TestMethodsDemo8 {

	static double findArTrin(double base, double height) {
		double artr = 0.5 * base * height;
		return artr;
	}

	double findArRec(double length, double breadth) {
		double arrec = length * breadth;
		return arrec;
	}

	double findArSq(double side) {
		double arsq = side * side;
		return arsq;
	}

	static double findArCir(double radius) {
		double arCir = Math.PI * radius * radius;
		return arCir;
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);

		// Find Area of Triangle
		System.out.println("Enter a Base : ");
		double base = sc.nextDouble();
		System.out.println("Enter a Height : ");
		double height = sc.nextDouble();
		double areaOfTriangle = findArTrin(base, height);
		System.out.println("Area of Triangle is : " + areaOfTriangle);
		System.out.println("*****************************");

		// Find Area of Circle
		System.out.println("Enter Radius  ");
		double r = sc.nextDouble();
		double areaOfCircle = findArCir(r);
		System.out.println("Area of Circle : " + areaOfCircle);

		System.out.println("main method ended ");
	}

}
