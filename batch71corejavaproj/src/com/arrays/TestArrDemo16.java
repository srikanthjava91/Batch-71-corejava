package com.arrays;

//WAP to print Jagged Array with Only Row Specification .? 
//Array of Arrays will consider as Jagged Array.
public strictfp class TestArrDemo16 {

	int a = 10;

	public static void main(String[] args) {

		System.out.println(10.5 / 0);

		int[][] n = new int[2][];// 0 1
//
		n[0] = new int[3];// 0 1 2
		n[1] = new int[3];// 0 1 2

		n[0][0] = 100;
		n[0][1] = 200;
		n[0][2] = 300;

		n[1][0] = 400;
		n[1][1] = 400;
		n[1][2] = 400;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
}
