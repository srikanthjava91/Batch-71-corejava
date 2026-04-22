package com.languagefun.constructors;

//In the given program, There is no explicit constructor 
//but still we are calling Constructor from line no. 13 then which constructor called ..?
//ans : default constructor 

//Whenever the class does not contains any constructors 
//then Java compiler create a default constructor which we cannot see.
public class Student {

	int sid;
	String sname;

	public static void main(String[] args) {
		System.out.println("main method started !");

		// Object creation
		// The below Object is created with the help of default constructor.
		Student s1 = new Student();
		
		s1.sid = 101;
		s1.sname = "Srikanth";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
	}
}
