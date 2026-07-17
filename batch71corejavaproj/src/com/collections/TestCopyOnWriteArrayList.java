package com.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayList {

	public static void main(String[] args) {

		List<String> names = new CopyOnWriteArrayList<>();
		names.add("J2SE");
		names.add("J2SE");
		names.add("Servlets");
		names.add("Spring");
		names.add("Spring Boot");
		names.add("React");

//		When we add any elements while Iterating the List, we will get below Exception
//		which is java.util.ConcurrentModificationException will consider as 
//		"Fail-Fast."

//		Even though we added elements while iterating, we will not get 
//		any Exceptions and adding the elements to the List will consider as 
//		"Fail-Safe."
//		Iterator<String> itr = names.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			names.add("Spring AI");
//		}

		for (String name : names) {
			System.out.println(name);
			names.add("Spring AI");
		}

//		If we add here, we will not get ConcurrentModificationException but 
//		this loop will infinite and we will get StackOverFlowError later 
//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
////			names.add("Spring AI");
//		}
		System.out.println(names);
	}
}
