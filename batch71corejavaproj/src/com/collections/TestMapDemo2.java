package com.collections;

import java.util.IdentityHashMap;
import java.util.Map;

//HashMap(.equals) vs IdntityHashMap(==)

//HashMap internally checks the equals method to compare the key values.
//Where as, in both cases like String Literals & String Objects its checking the content only.
//but not addresses.

//IdentityHashMap internally checks the == Operator to compare the key values.
//Where as, String Literals case, both addresses are same so in Map its not created new values.
//But, in String Object case both addresses are different so even though the keys are same we can add same keys for a map.
public class TestMapDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Map<String, String> map = new IdentityHashMap<>();

//		String s1 = "Java";
//		String s2 = "Java";
//
//		map.put(s1, "Srikanth");// Java= Srikanth
//		map.put(s2, "Vcube");// Java = Vcube
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		map.put(s1, "Srikanth");// Java= Srikanth
		map.put(s2, "Vcube");// Java = Vcube

		System.out.println(map);
	}
}
