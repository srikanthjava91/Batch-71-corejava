package com.arrays;

import java.util.HashSet;
import java.util.Set;

//Q) WAP to find the Duplicate elements from a Given Array using HashingSet..? 
//HashSet methodology (Time Complexity  : O(n), Space Complexity : O(n))
public class TestArrDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, 2, 3, 4, 1, 2, 1, 2, 1, 2 };
		Set<Integer> s = new HashSet<>();

		for (int a : arr) {
			if (!s.add(a)) {
				System.out.println(a);
			}
		}

		System.out.println("main method ended ");
	}

}
