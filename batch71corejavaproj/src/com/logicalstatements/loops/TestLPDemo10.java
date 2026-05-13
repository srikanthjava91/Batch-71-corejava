package com.logicalstatements.loops;

//Q) WAP to Generate a 6 digit OTP using for loop ..? 
public class TestLPDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

//		Returns a double value with a positive sign, 1.0 > rv >=0.0
//		greater than or equal to 0.0 and less than 1.0. 
//		System.out.println(Math.random() * 10);

		String otp = "";
		for (int i = 1; i <= 6; i++) {
			otp = otp + (int) (Math.random() * 10);// 245367
		}

		System.out.println("OTP is :  " + otp);
	}

}
