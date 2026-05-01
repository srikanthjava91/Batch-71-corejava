package com.operators;

//4) Comparison or Relational Operators 
//Will always return boolean values like either true or false.
//== 
//< <= 
//> >= 
//!

//== Operator checks the values if the data types are Primitive.
//== Operator Checks addresses if the data types are Object type.
//.equals() method from String class checks the content of the String.

public class TestOpDemo5 {

	public static void main(String[] args) {

		int i = 5;
		int j = 10;
		int k = 10;

		Integer i1 = 100;
		Integer i2 = 100;

		Integer i3 = 128;
		Integer i4 = 128;

		System.out.println(i1 == i2);// true
		System.out.println(i3 == i4);// false

		System.out.println("*******************");
		String s = "Srikanth";// SCP
		String s1 = "Srikanth";// SCP
		String s2 = new String("Srikanth");// Heap
		String s3 = new String("Srikanth");// Heap

		System.out.println(s2.equals(s3));// true
		System.out.println(i == j);// false
		System.out.println(j == k);// true

		System.out.println(s == s1);// true
		System.out.println(s1 == s2);// false
		System.out.println(s2 == s3);// false

		System.out.println("*******************");
		System.out.println(i < j);// true
		System.out.println(j <= k);// true
		System.out.println(i <= k);// true

		System.out.println("*******************");
		System.out.println(i > j);// false
		System.out.println(j >= k);// true
		System.out.println(i >= k);// false
		System.out.println("****************");

		System.out.println(!(i < j));// false

	}

}
