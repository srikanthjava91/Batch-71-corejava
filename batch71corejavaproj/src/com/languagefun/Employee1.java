package com.languagefun;

//all instance variables are storing inside the heap area.
//all static variables are storing inside the method area.
//all local variables are storing inside the stack area.

public class Employee1 {

	// The blank final field eid may not have been initialized
	int eid = 10;
	String ename = "Sri";

	final static int orgID = 999;
	final static String orgName = "TCS";

	public static void main(String[] args) {

		System.out.println(true);

		byte b = 10;
		b += 1;// b = b+1;
		b += 1;
		System.out.println(b);

		// The final field Employee1.orgID cannot be assigned
//		orgID = 9988;
//		orgName = "Tata";

		System.out.println(Employee1.orgID);// 999
		System.out.println(Employee1.orgName);// TCS

		Employee1 e1 = new Employee1();
		System.out.println(e1.eid);
		System.out.println(e1.ename);

		Employee1 e2 = new Employee1();
		// The final field Employee1.eid cannot be assigned
		e2.eid = 10;
		e2.ename = "Sachin";
		System.out.println(e2.eid);
		System.out.println(e2.ename);

	}

}
