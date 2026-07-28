package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLaptop {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Laptop l1 = new Laptop("Intel Graphics", "Dell", 100000.00);
		Laptop l2 = new Laptop("Vivo Book", "ASUS", 45000.00);
		Laptop l3 = new Laptop("Victus", "HP", 80000.00);
		Laptop l4 = new Laptop("Thinkpad", "Lenovo", 75000.00);

		List<Laptop> laptopList = new ArrayList<>();

		laptopList.add(l1);
		laptopList.add(l2);
		laptopList.add(l3);
		laptopList.add(l4);

//		The below code meaning is Anonymous Inner class implements Comparator.

		Comparator<Laptop> c = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.price < o2.price) {
					return -1;
				} else if (o1.price > o2.price) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(laptopList, c);

		for (Laptop l : laptopList) {
			System.out.println(l);
		}

		System.out.println("main method ended ");

	}
}
