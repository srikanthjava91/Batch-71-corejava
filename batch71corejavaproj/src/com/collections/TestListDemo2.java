package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo2 {

	public static void main(String[] args) {

		// Spring AI, Java, Spring, SQL, React,
		// CSS,Spring AI,HTML,Java,PLSQL, Spring,MYSQL, SQL React,
		List<String> names = new ArrayList<>();
		names.add("Spring AI");
		names.add("React");
		names.add(1, "Java");
		names.add(2, "Spring");
		names.add(3, "SQL");
		names.add(3, "MYSQL");
		names.add(2, "PLSQL");
		names.add(1, "HTML");
		names.add(0, "CSS");
		System.out.println(names);
	}
}
