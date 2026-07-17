package com.collections;

import java.util.Vector;

public class TestVectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();

		v.add(0, 15);
		v.addElement(10);
		v.addElement(15);
		v.addElement(20);
		v.addElement(18);
		v.addElement(15);
		v.addElement(null);
		v.addElement(null);
		v.addElement(10);
		v.addElement(15);
		v.addElement(20);
		v.addElement(18);
		v.addElement(15);

//		for (Integer e : v) {
//			System.out.println(e);
//		}

//		Enumeration<Integer> e = v.elements();
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
//
//		Iterator<Integer> vitr = v.iterator();
//		while (vitr.hasNext()) {
//			System.out.println(vitr.next());
//		}

		System.out.println(v);

	}

}
