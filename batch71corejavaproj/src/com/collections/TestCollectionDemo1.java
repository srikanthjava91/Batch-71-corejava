package com.collections;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollectionDemo1 {

	public static void main(String[] args) {

//		Object[] objs = new Object[5];
//
//		objs[0] = 10;
//		objs[1] = "Srikanth";
//
//		for (Object obj : objs) {
//			System.out.println(obj);
//		}

		System.out.println("*************************");

//		Cannot instantiate the type Collection
//		Collection c = new Collection();

//		Collection is a raw type. 
//		References to generic type Collection<E> 
//		should be parameterized
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(100);
		c1.add(200);
		c1.add(300);
		System.out.println(c1);

		Collection<String> c2 = new ArrayList<>();
		c2.add("Srikanth");
		c2.add("Java");
		c2.add("Vcube");
		System.out.println(c2);
		
		

	}

}
