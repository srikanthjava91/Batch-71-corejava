package com.languagefun;

//byte --> short --> int --> long -->float --> double 
public class TestDataTypesDemo1 {

//	byte : 1byte = 8 bits
//	Range is : -128 to 127 
//	RHS is always int value if it is a number.
//	If we are giving more than 127 will throw a CE like below.
//	Type mismatch: cannot convert from int to byte
//	Type Casting : Converting One Data type value into another data Types will consider as Type-Casting.
	byte b = (byte) 257;// Explicit Type casting.//o/p: -126
	byte b1 = -126;

//	Short : 2 bytes = 16 bits --> 2^16
//	Range is : -32768 to 32767
//	If we are giving more tha 32767 will get a CE like below.
//	Type mismatch: cannot convert from int to short
	short s = (short) 32768;// Explicit Type casting.//o/p: -32768

//	int : 4 bytes = 32 bits : 2^31
//	Range is : -2147483648 to 2147483647
//	If we are Giving more than int value, we will get a CE like below.
//	CE : The literal 2147483648 of type int is out of range. 
	int i = (int) 2147483648L;

//	long : 8 bytes = 64 bits : 2^63 
//	Range is : 9223372036854775808 
	long l = 9223372036854775807L;
	long l1 = 2147483648L;

//	If the RHS value is decimal point data then will consider by default double.
//	Type mismatch: cannot convert from double to float
	float f = 5.9F;
	double d = 5.9;

	float f1 = 9972.67545657654675675F;
	double d1 = 9972.67545657654675675;

	char c = 'M';

	// A=65 B=66......Z=90
	// a=97 b=98......z=122
	// Internally it's converting int to char.
	char c1 = 73;// ASCII characters --> A//Implicit Type casting
	char c2 = '\u0041';// unicode charcters
	int i1 = 'A';// Char can also converts to int

	boolean boo = true;

//	boolean boo1 = 0;
//	boolean boo2 = 1;

//	boolean boo3 = "false";
//	boolean boo4 = "true";

//	boolean boo5 = False;
//	boolean boo6 = True;

//	boolean boo5 = FALSE;
//	boolean boo6 = TRUE;

	public static void main(String[] args) {

		System.out.println("main method started ");

		byte b = 10;
		int i5 = b;// Implicit Type casting
		short s1 = (short) i5;// Explicit Type casting
		System.out.println("s1 : " + s1);

		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();
		System.out.println("byte value : " + t1.b);// 0
		System.out.println("byte value : " + t1.b1);// 0
		System.out.println("short value : " + t1.s);// 0
		System.out.println("int value : " + t1.i);// 0
		System.out.println("int value : " + t1.i1);// 65

		System.out.println("long value : " + t1.l);// 0
		System.out.println("******************");
		System.out.println(t1.f);// 0.0
		System.out.println(t1.f1);// 0.0
		System.out.println(t1.d1);// 0.0
		System.out.println(t1.d);// 0.0
		System.out.println("******************");
		System.out.println(t1.c);//
		System.out.println(t1.c1);//
		System.out.println(t1.c2);//
		System.out.println(t1.boo);// false

//		if (t1.boo) {
//			System.out.println("Java is simple !");
//		}

		System.out.println("main method ended !");

	}

}
