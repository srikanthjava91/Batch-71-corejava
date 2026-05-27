package com.arrays;

public class TestArrDemo19 {

	public static void main(String[] args) {

		System.out.println("main method strated ");

		int[][][] arr = new int[3][3][3];// 0 1 2 --> 0 1 2--> 0 1 2

		arr[0][0][0] = 100;
		arr[1][1][1] = 200;
		arr[2][2][2] = 300;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

//		for(int[][] arr2:arr) {
//			for(int[] arr1:arr2) {
//				for(int a:arr1) {
//					System.out.print(a + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

	}

}
