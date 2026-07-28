package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

//Set --> HashSet, LinkedHashSet 
//SortedSet --> TreeSet 
//NavigableSet --> TreeSet 

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet<String> s1 = new TreeSet<>();
		s1.add("Java");
		s1.add("J2SE");
		s1.add("J2EE");
		s1.add("Java");
		s1.add("Java");
		System.out.println(s1);

		SortedSet<Integer> ss = new TreeSet<>();

		ss.add(8);
		ss.add(8);
		ss.add(18);
		ss.add(5);
		ss.add(7);
		ss.add(2);
		ss.add(10);
		ss.add(9);
		ss.add(15);
		ss.add(6);
		// 2 5 6 7 8 9 10 15 18
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
//		 Returns a view of the portion of this set whose elements are strictly less
//		 than toElement.
		System.out.println(ss.headSet(9));// [2, 5, 6, 7,8]
		
//		Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
		System.out.println(ss.tailSet(9));
		
//		fromElement low endpoint (inclusive) of the returned set
//		toElement high endpoint (exclusive) of the returned set
		System.out.println(ss.subSet(7, 15));//7 8 9 10 
		
		System.out.println(ss.reversed());

	}

}
