package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestListDemo7 {

	public static void main(String[] args) {

		List<Integer> ll = new ArrayList<>();

		ll.add(7);
		ll.add(2);
		ll.add(5);
		ll.add(4);
		ll.add(3);
		ll.add(15);
		ll.add(11);
		ll.add(10);

		System.out.println(ll);

		Collections.sort(ll);

		System.out.println(ll);

	}

}
