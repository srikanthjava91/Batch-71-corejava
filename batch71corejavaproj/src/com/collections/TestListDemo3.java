package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		List<String> boys = new ArrayList<>();

		boys.add("Vinay");
		boys.add("Anil");
		boys.add("Pramod");
		boys.add("Vinod");
		boys.add("Surendra");
		System.out.println(boys);

		List<String> girls = new ArrayList<>();

		girls.add("Anjali");
		girls.add("Archana");
		girls.add("Keerthi");
		girls.add("Rajeswari");
		girls.add("Divya");

		System.out.println(girls);

		List<String> kids = new ArrayList<>();
		kids.add("Aditya");
		kids.add("Ram");
		kids.add("Sri");

		List<String> students = new ArrayList<>();

		students.addAll(boys);
		students.addAll(girls);

		students.addAll(1, kids);

		System.out.println(students);

		System.out.println("****for loop***********************");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		System.out.println("*****for each loop**********************");

		for (String s : students) {
			System.out.println(s);
		}

		System.out.println("*******Iterator*****************************");

		Iterator<String> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(students.indexOf("Pramod"));

	}

}
