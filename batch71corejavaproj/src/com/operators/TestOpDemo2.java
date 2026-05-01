package com.operators;

//2) Assignment Operators 
//+= -= *= /= %= : Compound Assignment operators 
//= 
public class TestOpDemo2 {

	public static void main(String[] args) {

		int x = 10;
		System.out.println(x);

		int result = 0;
//		LHS is always a variable 	= RHS is always a value 
		result = result + 5;
		System.out.println(result);// 5

		// CE: Type mismatch: cannot convert from double to int
//		result = result+ 5.5;//we cannot mix double with int 
//		result = (int) (result + 5.5);// explicit Type Casting or Narrowing
		result += 5.5;// result = result + 5.5
		System.out.println("Compound sum : " + result);// 10

//		result = result -4.5;
		result -= 4.5;// 5
		System.out.println("Compound diff : " + result);// 5

//		result = result * 3.5;
		result *= 3.5;
		System.out.println("Compound product : " + result);// 17

//		result = result/2.5;
		result /= 2.5;
		System.out.println(result);// 6

//		result =result % 2.5;//6 %2.5
		result %= 2.5;
		System.out.println(result);

	}

}
