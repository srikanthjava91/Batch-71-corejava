package com.collections;

import java.util.Map;
import java.util.WeakHashMap;

//WeakHashMap vs HashMap
class Employee1 {

	@Override
	public String toString() {
		return "Employee";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called !");
	}
}

//HashMap Dominates Garbage Collection and HashMap Objects are not eligible for Garbage collection.
//Garbage Collection Dominates WeakHashMap.
public class TestMapDemo3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started ");

		Map<Object, String> map = new WeakHashMap<>();
		Employee1 emp = new Employee1();
		map.put(emp, "Hello");
		System.out.println(map);
	
		emp = null;
		System.gc();
		Thread.sleep(2000);

		System.out.println(map);
	}
}
