package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		List<Integer> l1 = new ArrayList<>();

		l1.add(10);
		l1.add(15);
		l1.add(21);
		l1.add(7);

		l1.add(0, 25);// 25 10 15 21 7
		l1.set(0, 35);// 35 10 15 21 7
		System.out.println(l1);// 35 10 15 21 7

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(15);
		l.add(21);
		l.add(7);
		l.add(45);
		l.add(10);
		l.add(2);
		l.add(3);

		l.remove(l.indexOf(10));
		l.remove(l.lastIndexOf(10));
		System.out.println(l);

	}

}
