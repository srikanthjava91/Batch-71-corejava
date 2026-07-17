package com.collections;

import java.util.ArrayList;
import java.util.List;

//Q) The default capacity of ArrayList is -->  10.
//Q) When we are adding the 11th element for ArrayList then what is the Capacity..?
//  Current_Capacity * 3/2 ==> 10 *3 ==> 30/2 = 15 
// (Current_Capacity+ Half of the Current_Capacity)

public class TestArrayListDemo {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Constructs an empty list with an initial capacity of ten.
		List<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(5);
		al.add(25);

		al.add(52);
		al.add(51);
		al.add(16);

		al.add(18);
		al.add(10);
		al.add(1);
		al.add(5);
		
		al.add(100);

		System.out.println(al.size());// 0
		System.out.println(al);

	}

}
