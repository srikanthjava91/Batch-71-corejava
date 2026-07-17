package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo4 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		List<String> names = new ArrayList<>();

		names.add("Anjali");
		names.add("Archana");
		names.add("Keerthi");
		names.add("Rajeswari");
		names.add("Divya");
		
		names.remove("Anjali");

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("**********************");
		ListIterator<String> litr = names.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("------------------------");
		
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
