package com.oops02;

class Employee {
	int eid;
	String name;
	Department department;

	public Employee(int eid, String name, Department department) {
		this.eid = eid;
		this.name = name;
		this.department = department;
	}

	public Employee(Employee emp) {

		this.eid = emp.eid;
		this.name = emp.name;
		this.department = new Department(emp.department);

	}

}

class Department {

	String name;

	public Department(String name) {
		this.name = name;
	}

	Department(Department department) {
		this.name = department.name;
	}

}

public class TestDeepCopy {

	public static void main(String[] args) {

		Department d = new Department("Java");
		Employee emp1 = new Employee(1, "Srikanth", d);
		System.out.println(emp1.eid);
		System.out.println(emp1.name);
		System.out.println(emp1.department.name);

		System.out.println("-------------------------");
		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.eid);
		System.out.println(emp2.name);
		System.out.println(emp2.department.name);

		System.out.println("*************************");
		emp2.eid = 9;
		emp2.department.name = "JFS";
		System.out.println("*************************");
		System.out.println(emp2.eid);
		System.out.println(emp2.name);
		System.out.println(emp2.department.name);
		System.out.println("-------------------------");
		System.out.println(emp1.eid);
		System.out.println(emp1.name);
		System.out.println(emp1.department.name);

	}

}
