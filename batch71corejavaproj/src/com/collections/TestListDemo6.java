package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo6 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(10);
		l1.add(15);
		l1.add(21);
		l1.add(7);
		l1.add(17);
		l1.add(72);

		System.out.println(l1);

		List<Integer> l2 = l1.subList(0, 3);
		System.out.println(l2);
		l2.add(100);
		System.out.println(l2);

		System.out.println(l1);

	}

}
