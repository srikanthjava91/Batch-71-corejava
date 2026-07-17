package com.collections;

import java.util.List;
import java.util.ArrayList;

public class TestListDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(4);
		l.add(0, 5);
		l.add(3);
		l.add(3, 15);
		l.add(1);
		l.add(6, 65);
		l.add(null);
		l.add(null);
		l.add(null);

		// 5 10 4 15 3 1 null null null
		System.out.println(l);// 5 10 4 15 3 1 null null null

	}
}
