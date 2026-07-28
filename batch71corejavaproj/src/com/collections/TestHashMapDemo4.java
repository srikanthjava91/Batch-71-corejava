package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//WAP to find each character count from  a given String ..?
//Input : Java 
// Output --> J=1 a = 2 v=1 
public class TestHashMapDemo4 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new LinkedHashMap<>();

		System.out.println(map);// {}

		System.out.println("Enter a String : ");
		String str = sc.nextLine();// Java

		char[] ch = str.toCharArray();// J a v a --> J=1 a=1 v=1

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

		Set<Map.Entry<Character, Integer>> entries = map.entrySet();

		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}
}
