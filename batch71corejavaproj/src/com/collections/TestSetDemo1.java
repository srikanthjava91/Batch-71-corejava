package com.collections;

import java.util.Set;
import java.util.LinkedHashSet;

public class TestSetDemo1 {

	public static void main(String[] args) {

		// Constructs a new, empty set; the backing HashMap instance has default initial
		// capacity (16) and load factor (0.75).

//		i) HashSet internally working based on HashMap 
//		 map = new HashMap<>();
		Set<Integer> numbers = new LinkedHashSet<>();

//		ii) When we add the element, internally it's using put method to 
//		add the element as a Key and the value is PRESENT 
//		map.put(e, PRESENT)==null;
//		PRESENT means new Object();

//		iii) Where HashMap internally creating a Hashtable with default capacity of 16 
//		to arrange the elements will consider as Buckets.

//		iv) While adding, whenever the same reminder is for two different values then internally
//		the Bucket is using LinkedList to add the two or more elements.
//		if we add more than one elements in  Bucket will consider as HashCollision.
//		If the elements are Greater than 8 then internally 
//		it creates "RED-BLackTree" for Better Optimization with less Time Complexity like O(log n)

//		v)  By default, the load factor is 0.75 means the Threshold value will be 16*0.75 = 12.

//		vi) Once the values are Reaching, Threshold values then 
//		the capacity will be moving to double of current capacity which is 32 and 
//		the reminder will calculate with 32 only and it's re-arranging the current table. 

		numbers.add(56);// 56%16 --> 8
		numbers.add(15);// 15%16 --> 15
		numbers.add(4);// 4 % 16--> 4
		numbers.add(3);// 3 % 16--> 3
		numbers.add(25); // 25%16 --> 9
		numbers.add(33);// 33%16 --> 1
		numbers.add(73);// 73%16 --> 9
		numbers.add(10);// 10%16 --> 10
		numbers.add(10);// 10%16 --> 10
		numbers.add(10);// 10%16 --> 10
		numbers.add(10);// 10%16 --> 10

		System.out.println(numbers);// 33 3 4 56 25 73 10 15

	}

}
