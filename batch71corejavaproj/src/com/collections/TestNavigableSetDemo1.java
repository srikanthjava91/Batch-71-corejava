package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSetDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		NavigableSet<Integer> ns = new TreeSet<>();

		ns.add(500);
		ns.add(200);
		ns.add(300);
		ns.add(100);
		ns.add(400);
		ns.add(600);
		ns.add(800);
		ns.add(700);

		System.out.println(ns);
		System.out.println(ns.reversed());

//		Returns the greatest element in this set less than or equal 
//		to the given element, or null if there is no such element.
		System.out.println(ns.floor(300));
		System.out.println(ns.floor(50));//null

//		Returns the least element in this set greater than or 
//		equal to the given element, or null if there is no such element.
		System.out.println(ns.ceiling(300));
		System.out.println(ns.ceiling(1000));
		
//		Returns the greatest element in this set strictly less than the given element, 
//		or null if there is no such element.
		System.out.println(ns.lower(300));
		
//		Returns the least element in this set strictly greater than the given element,
//		or null if there is no such element.
		System.out.println(ns.higher(400));

		System.out.println("main method ended ");
	}

}
