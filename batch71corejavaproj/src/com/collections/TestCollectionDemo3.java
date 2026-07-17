package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo3 {

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		Collection<String> c = new ArrayList<>();
		c.add("ABC");
		c.add("BAT");
		System.out.println(c.hashCode());
		
		Collection<Integer> c1 = new ArrayList<>();
		
		c1.add(101);//31*1 + 101 = 132
		c1.add(102);//31 * 132 + 102 = 4194
		System.out.println(c1.hashCode());
		System.out.println(c1);
		

		Collection<Integer> c2 = new ArrayList<>();
		c2.add(102);
		c2.add(101);
		System.out.println(c2);
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));//

	}

}
