package com.oops01;

public class TetStudent {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		Student s1 = new Student();

		s1.setSid(18);
		s1.setSname("Virat");
		s1.setAge(38);

		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getAge());
		
		
		Student s2 = new Student();

		s2.setSid(45);
		s2.setSname("Rohit");
		s2.setAge(37);

		System.out.println(s2.getSid());
		System.out.println(s2.getSname());
		System.out.println(s2.getAge());


	}

}
