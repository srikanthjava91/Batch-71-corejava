package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapDemo1 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("TG", "Telangana");
//		map.put("AP", "Andhra Pradesh");
		map.put("KA", "Banglore");
		map.put("TN", "Chennai");

//		Whenever we have Duplicate key, the old value is replacing with new value.
		map.put("TN", "Tamilnadu");

		System.out.println(map.put("AP", "Amaravathi"));
		System.out.println(map.put("TN", "Vijay Dalapathi"));

		System.out.println(map.get("KA"));
		System.out.println(map.get("TN"));
		System.out.println(map);
	}
}
