package com.collections;

import java.util.Stack;

//Stack is working Based on the LIFO : Last In First Out 
public class TestStackDemo {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Stack<String> ss = new Stack<>();

//		ss.push("J2SE");
//		ss.push("J2EE");
//		ss.push("J2ME");
//		ss.push("Spring");
//		ss.push("React");
//		ss.push("Servlets");
//		ss.push("Servlets");
//		ss.push("Jsp");
		
		System.out.println(ss.empty());
		
		System.out.println(ss.search("React"));

		System.out.println(ss);

		System.out.println(ss.pop());//Jsp
//		Looks at the object at the top of this stack without removing it 
//		from the stack.
		System.out.println(ss.peek());//Servlets
		
		System.out.println(ss);
		System.out.println("main method ended !!");
	}

}
