package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListDemo2 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(45, "Rohit", 4500000.00, 38);
		Employee emp2 = new Employee(18, "Kohli", 1800000.00, 37);
		Employee emp3 = new Employee(7, "Dhoni", 700000.00, 42);
		Employee emp4 = new Employee(77, "Gill", 7700000.00, 27);

		List<Employee> empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

//		System.out.println(empList);

		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

}
