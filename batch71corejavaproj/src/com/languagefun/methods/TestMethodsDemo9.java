package com.languagefun.methods;

class Employee {
	int eid;
	String ename;
}

public class TestMethodsDemo9 {

	// Factory method : A method is return any type of object will consider as
	// Factory method
	Employee getEmployeeDetails() {
		Employee e = new Employee();
		e.eid = 101;
		e.ename = "Srikanth";
		return e;
	}

	public static void main(String[] args) {

		System.out.println("main method started ");
		TestMethodsDemo9 t = new TestMethodsDemo9();
		Employee emp1 = (Employee) t.getEmployeeDetails();
		System.out.println(emp1.eid);
		System.out.println(emp1.ename);

		Employee emp2 = (Employee) t.getEmployeeDetails();
		System.out.println(emp2.eid);
		System.out.println(emp2.ename);

	}

}
