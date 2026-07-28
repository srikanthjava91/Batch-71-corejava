package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {

		Mobile m1 = new Mobile("10R", "One Plus", 40000.00);
		Mobile m2 = new Mobile("17Pro", "Iphone", 140000.00);
		Mobile m3 = new Mobile("10x", "Red Magic", 80000.00);
		Mobile m4 = new Mobile("F31", "OPPO", 35000.00);
		Mobile m5 = new Mobile("A8", "Nokia", 25000.00);

		List<Mobile> mobileList = new ArrayList<>();

		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);
		Collections.sort(mobileList);
		for (Mobile m : mobileList) {
			System.out.println(m);
		}

	}

}
