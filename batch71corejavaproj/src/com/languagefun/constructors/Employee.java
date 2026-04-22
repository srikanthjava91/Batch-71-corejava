package com.languagefun.constructors;

//Q)Why we need no arg constructor when java compiler is providing default constructor ..?
//ans1 : Instead of JVM providing default values for my instance data 
//as a developer we want to provide default values for instance data we need no arg constructor.

//ans2: Whenever we have parameterized constructor, 
//If we want create object without passing any values 
//then Java Compiler wont create any default constructor 
//because already we have parameterized constructor,
//SO we must need to create no arg constructor.  
public class Employee {

	int eid;
	String ename;

	// no-arg constructor
	Employee() {
		System.out.println("no arg constructor called ");
		eid = 101;
		ename = "unknown";
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

//		The below Object created with the help of default constructor
//		The below Object is created with the help of no-arg constructor 
		Employee e1 = new Employee();
		System.out.println("EID : " + e1.eid);
		System.out.println("ENAME : " + e1.ename);
		
		Employee e2 = new Employee();
		System.out.println("EID : " + e2.eid);
		System.out.println("ENAME : " + e2.ename);

		System.out.println("main method ended !!");
	}
}
