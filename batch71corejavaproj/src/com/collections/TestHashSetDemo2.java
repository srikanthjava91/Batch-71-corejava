package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetDemo2 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();

		s.add("BC");//hash=0 --> 0*31 +66 --> hash =66 -->31*66 + 67 = 
		s.add("AB");
		s.add("DE");
		s.add("A");
		s.add("ABC");
		s.add("ab");

		System.out.println(s);
	}

}
