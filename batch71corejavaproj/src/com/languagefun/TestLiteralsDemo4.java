package com.languagefun;

//null lIterals 
//Boolean Literals 

public class TestLiteralsDemo4 {

	public static void main(String[] args) {

		boolean cskWOn2026IPL = false;

//		if (cskWOn2026IPL) {
//			System.out.println("Congratulation !!");
//		} else {
//			System.out.println("Will come next year !!");
//		}

		String s = null;// null is Literal value we can store only for Object data types.
		TestLiteralsDemo4 t1 = null;

		// Type mismatch: cannot convert from null to int
//		int i = null;//no we cannot store null for primitive data types.

		s = new String("Java is simple");
		System.out.println(s);

		t1 = new TestLiteralsDemo4();
		System.out.println(t1);

	}

}
