package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo5 {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Guava");
		fruits.add("Grapes");
		System.out.println(fruits);

		Collection<String> vegetables = new ArrayList<>();

		vegetables.add("Tomato");
		vegetables.add("Potato");
		vegetables.add("Brinjal");
		vegetables.add("Drumsticks");
		vegetables.add("Banana");
		vegetables.add("Spinach");
		System.out.println(vegetables);

		fruits.retainAll(vegetables);
		System.out.println(fruits);
		System.out.println(vegetables);
		System.out.println(vegetables.size());

		System.out.println("------------------");
		Object[] objs = vegetables.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}

		System.out.println("------------------------");
		Collection<String> names = new ArrayList<>();
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Mahesh");

		String[] arr = names.toArray(new String[0]);

		for (String name : arr) {
			System.out.println(name);
		}

	}

}
