package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Banana");

		if (!fruits.isEmpty()) {
			fruits.add("Mango");
			fruits.add("Orange");
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Pineapple");
			fruits.add("Guava");
			fruits.add("Grapes");
		}

//		for (String fr : fruits) {
//			if (fr.equals("Mango")) {
//				continue;
//			}
//		}

		System.out.println(fruits);

		System.out.println("------------------------");

		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("Guava")) {
				itr.remove();
			}
		}

		fruits.remove("Pineapple");
		System.out.println(fruits);

	}

}
