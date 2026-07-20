package com.collections;

import java.util.HashMap;
import java.util.Map;

//Map is working Based on the Key & value pairs.
public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(18, "Virat");
		map.put(45, "Rohit");
		map.put(1, "K L Rahul");
		map.put(9, "Srikanth");
		map.put(7, "Dhoni");
		map.put(18, "Nagendra");

		System.out.println(map);
	}
}
