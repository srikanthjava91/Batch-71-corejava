package com.arrays;

//WAP to print 2 rows and 3 columns and represent numbers..? 
public class TestArrDemo12 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		int[][] arr = new int[2][3];// 0 1 ---> 0 1 2 --> 6 elements

//		System.out.println(arr.length);// Row size--> 2
//		
//		System.out.println(arr[0].length);//Column size --> 3
//		System.out.println(arr[1].length);//Column size --> 3

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int[] arr1:arr) {
			for(int a:arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
