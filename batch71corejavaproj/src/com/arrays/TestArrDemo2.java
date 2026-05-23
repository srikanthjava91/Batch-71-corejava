package com.arrays;

//Q) WAP to Represent String Elements..?
public class TestArrDemo2 {

	public static void main(String[] args) {

//		int a;
//		System.out.println(a);

//		Note1 : The size a can int max which is 2147483647
//		Even if we give int max, we will get OutOfMemoryError

//		Note2: If we give Negative values, we will get a Runtime exception saying 
//		NegativeArraySizeException 

//		The literal 2147483648 of type int is out of range 
		String[] names = new String[5];// 0 1 2 3 4

		names[0] = "Abhishek";
		names[1] = "Sanju";
		names[2] = "Tilak";
		names[3] = "Kohli";
		names[4] = "Rohit";

		for (int i = 0; i < names.length; i++) {
			if(names[i].contains("i")) {
				System.out.println(names[i]);
			}
		}

		System.out.println("--------------------");
//		Java 1.5 introduced "for each" or "enhanced for loop"
//		Without indexes we can represent the values.
		for (String name : names) {
			if (name.contains("o")) {
				System.out.println(name);
			}
		}
	}
}
