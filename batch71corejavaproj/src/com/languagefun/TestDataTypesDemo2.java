package com.languagefun;

import java.math.BigDecimal;
import java.math.BigInteger;

//A class is a User-defined data types
class Dog {
	
	String name;

	Dog(String str){
		name = str;
	}
	
}

public class TestDataTypesDemo2 {
	String str = "Srikanth";// String Literals
	String sr1 = new String("Srikanth Java");// String Object

	Integer i = 100;// int --> Integer
//	(Converting Primitive to Wrapper Object Data Types will consider as Auto-Boxing)

	int i1 = i;// Integer --> int
//	(Converting Wrapper Object Data Type to Primitive will consider as Auto-UnBoxing)

//	Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi = 100;//invalid

	BigInteger bi1 = new BigInteger("17878904234567897654356789654356787654");
	BigInteger bi2 = new BigInteger("98765434567890876543245678");

	BigDecimal bd1 = new BigDecimal(876545555.89);
	BigDecimal bd2 = new BigDecimal(98765555.89);

	Dog d = new Dog("Puppy");
	

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestDataTypesDemo2 t = new TestDataTypesDemo2();
		System.out.println(t.str);
		System.out.println(t.i);
		System.out.println(t.bi1);
		System.out.println(t.bi2);
		
		System.out.println(t.d);
		System.out.println(t.d.name);

		System.out.println("int values: " + (t.i1 + t.i));

		// The operator + is undefined for the argument type(s)
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t.bi1 + t.bi2);

		System.out.println(t.bi1.add(t.bi2));// 20
		System.out.println(t.bi1.multiply(t.bi2));// 20

		System.out.println(t.bd1.add(t.bd2));
		System.out.println(t.bd1.multiply(t.bd2));

//		System.out.println(t.d);
		System.out.println("main method ended !!");
	}
}
