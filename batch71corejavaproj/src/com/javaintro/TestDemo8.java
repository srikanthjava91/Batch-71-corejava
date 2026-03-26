package com.javaintro;

class Student1 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
	}

}

public class TestDemo8 {

//	 Object inside a method
	static void show() {
		System.out.println("show method called ");
		Student1 s = new Student1();
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();

//		s1 = null;//Nullifying the Object 
//		s3 = s1;//Re-assiging object
//		new Student1();// Anonymous object

		System.out.println(s1);// 7ad041f3
		System.out.println(s2);// 251a69d7
		System.out.println(s3);
		
		show();

		System.gc();

	}

}
