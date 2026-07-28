package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMapDemo3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(+91, "India");
		map.put(+91, "Bharath");
		map.put(+1, "USA");
		map.put(+61, "Australia");
		map.put(44, "United Kingdom");
		map.put(81, "Japan");
		map.put(86, "China");
		map.put(49, "Germany");

//      Whenever we want to represents one after another then we need to use entrySet() method from Map interface.
//      entrySet() is returning set of "Entry" interface which is the child interface of Map.

		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println(map);
		System.out.println(map.get(1));// USA
		System.out.println(map.containsKey(44));// true
		System.out.println(map.keySet());// [91,1,61,44,8186,49]
		System.out.println(map.values());//
	}

}
