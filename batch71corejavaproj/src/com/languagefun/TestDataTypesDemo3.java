package com.languagefun;

//byte --> Byte 
//short --> Short 
//int --> Integer 
//long --> Long 
//float --> Float 
//double --> Double 
//char --> Character 
//boolean --> Boolean 

//All the above Wrapper Object classes are from java.lang package.
//In Java, Wrapper OBject Data Types will use it in Collections.
//For Every Primitive data types, there is a WRapper Object.
//== equal operator checks the addresses of the Objects but not the values.
public class TestDataTypesDemo3 {

	public static void main(String[] args) {

		Integer i3 = 125;
		Integer i4 = 125;
		System.out.println(i3 == i4);// true

		Integer i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);// false

		System.out.println("*******************");
		String s = "123";
		// Converting String to int we need to use below Operation like
		int i1 = Integer.parseInt(s);
		System.out.println(i1 + 10);// 12310 --> 133

//		/Converting String to long we need to use below Operation like
		String s1 = "9972677655";
		long l1 = Long.parseLong(s1);
		System.out.println(l1);

	}

}
