package com.collections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		List<Integer> ll = new LinkedList<>();

		ll.add(50);
		ll.add(60);
		ll.add(null);
		ll.add(80);
		ll.add(90);
		ll.add(70);

		System.out.println(ll);
		
	}
}
