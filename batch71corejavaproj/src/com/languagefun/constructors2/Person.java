package com.languagefun.constructors2;

////it calls default constructors --> 
	///inside default constructor call super() with out values, 
	///So the child is expecting Parent no arg constructor,
	///So We cannot keep only Parent class constructor with Parameterized constructor, 
	///if we have like we cannot create object for Child and we cannot even extends that class  
//	Whenever we extends a class The parent class must contain no arg constructor.

//Child
class Employee extends Person {

	public Employee(int pid, String pname) {
		super(pid, pname);
		System.out.println("Employee Parameterized construtor called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Employee Child");
		Employee e1 = new Employee(101, "Sai");
		System.out.println(e1.pid);
		System.out.println(e1.pname);
	}
}

//parent 
public class Person {

	int pid;
	String pname;

	Person() {
		System.out.println("Person no arg constructor called ");
	}

	Person(int pid, String pname) {
		System.out.println("Person parameterized constructor called  ");
		this.pid = pid;
		this.pname = pname;

	}

	public static void main(String[] args) {
		System.out.println("main method started form Person Parent ");
	}
}
