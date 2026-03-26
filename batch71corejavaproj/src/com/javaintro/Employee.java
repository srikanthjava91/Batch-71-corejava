package com.javaintro;

public class Employee {

	int eid;
	String ename;

	static int orgId = 555;
	static String orgName = "TCS";

	public static void main(String[] args) {
		System.out.println("main method started !");

		Employee e1 = new Employee();
		e1.eid = 101;
		e1.ename = "Srikanth";
//		The static data we can access directly or 
//		with class name or with Object Reference variable
		System.out.println("----------------------------");
//		System.out.println(orgId);// 555
//		System.out.println(orgName);// TCS

		System.out.println(Employee.orgId);
		System.out.println(Employee.orgName);

//		The static field Employee.orgId should be accessed in a static way
//		System.out.println(e1.orgId);
//		System.out.println(e1.orgName);
		System.out.println("----------------------------");

		System.out.println(e1.eid);// 101
		System.out.println(e1.ename);// Srikanth

		System.out.println("**************************");
		Employee e2 = new Employee();
		e2.eid = 103;
		e2.ename = "Vishwa";
		System.out.println(Employee.orgId);//
		System.out.println(Employee.orgName);//
		System.out.println(e2.eid);// 103
		System.out.println(e2.ename);// Vishwa

		System.out.println("**************************");
		Employee e3 = new Employee();

		orgId = 666;
		orgName = "VSS";
		e3.eid = 104;
		e3.ename = "Ruchitha";

		System.out.println(Employee.orgId);
		System.out.println(Employee.orgName);
		System.out.println(e3.eid);
		System.out.println(e3.ename);

		System.out.println("**************************");
		Employee e4 = new Employee();
		System.out.println(Employee.orgId);
		System.out.println(Employee.orgName);
		System.out.println(e4.eid);
		System.out.println(e4.ename);
		
		
		
	}

}
