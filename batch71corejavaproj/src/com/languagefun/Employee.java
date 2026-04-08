package com.languagefun;

import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;

//14
public class Employee {

	int employee_id;
	String $employee_Name;
//	String new = "Hello";//invalid 
//	int id@1  =10;//Syntax error on token "@", = expected
	String var = "Hello";

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class.forName("");

		Scanner sc = new Scanner(System.in);

//		var var = 10;
		System.out.println("main method strated ");

		Employee emp1 = new Employee();
		System.out.println(emp1.employee_id);
		System.out.println(emp1.$employee_Name);
		emp1.hello1();

		System.out.println("main method ended ");

	}

	void hello1() {
		System.out.println("Hello1 method called ");
	}

}
