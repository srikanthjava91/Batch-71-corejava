package com.languagefun;

///character Literals 
///String Literals 
public class TestLiteralsDemo3 {

	public static void main(String[] args) {
		System.out.println("main  method started !!");
		////A collection of characters can store it into a single variable with double quotes 
		///will consider as String Literals.
		String s1 = "Srikanth";// String Literal --> SCP : String Constant Pool//1 object
		System.out.println(s1);

		// 0 objects
		String s4 = "Srikanth";// its not going to create new Object, its pointing to old object only
		System.out.println(s1 == s4);//true
		
		String s2 = new String();
		System.out.println(s2);// empty
		

		//2 objects 
		String s3 = new String("Java");// String Object Literal; Heap area
		System.out.println(s3);// Java
		
		//1 object
		String s5 = new String("Java");
		System.out.println(s3 == s5);//false

		TestLiteralsDemo3 t2 = new TestLiteralsDemo3();
		System.out.println(t2);// Address of the Object

//		short is 2 bytes = -32768 to 32767
//		char is 2 bytes = 65535--> 0 to 65535 
		char c = 678;// numbers or ASCII
		char c1 = 'A';// characters
		char c2 = '\u0021';// unicode

		System.out.println(c);// d
		System.out.println(c1);// A
		System.out.println(c2);// @

	}

}
