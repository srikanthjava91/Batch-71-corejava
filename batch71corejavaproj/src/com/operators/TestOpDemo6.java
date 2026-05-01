package com.operators;

//5) Logical Operators 
//--> Boolean expression 
///Will always return boolean values like either true or false.
//&& || ! 

//Note : //		In logical Operators the First Condition is false
//the second condition will never check will consider as dead code.
public class TestOpDemo6 {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c = 5;

		String name1 = "Java";
		String name2 = "Java";

		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false --> Dead code
		System.out.println(false && false);// false

		System.out.println("************************");
		System.out.println(a > b && b < a);// false
		System.out.println(name1.equals(name2) && a == c);// true
		System.out.println(name1.equals(name2) && a == b);// false
		System.out.println(b == c && a == c);// false
		System.out.println("--------------------------------");

		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false); // false

		System.out.println(name1 == name2 || a == c);// true
		System.out.println(name1 == name2 || a != c);// true
		System.out.println(name1 != name2 || a == c);// true
		System.out.println(name1 != name2 || a != c);// false

		System.out.println("----------------------------------");
		System.out.println(!(a == c) && name1 == name2);// false
		
//		System.out.println(10 && 10);//The operator && is undefined for the argument type(s) int, int
	}

}
