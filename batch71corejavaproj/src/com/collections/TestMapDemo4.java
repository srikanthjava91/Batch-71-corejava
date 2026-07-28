package com.collections;

import java.util.Hashtable;
import java.util.Map;

//If it is a HashMap, We can add one null key and also can add any number null values.
//If is is a Hashtable, We cannot any null keys's or any null value, 
//if we added by mistake we will get NullPointerExceptions.
public class TestMapDemo4 {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<>();

		map.put("apl", "Apple");
		map.put("orn", "Orange");
		map.put("bnn", "Banana");
		map.put("grp", "Grapes");
		map.put("chk", "Chikku");
//		map.put(null, "Chikku");
		map.put("abc", null);
		map.put("pin", null);

		System.out.println(map);
	}
}
