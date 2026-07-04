package com.arrys2;

public class TestTwoPointersSumDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		int[] arr = {2,3,7,8,9,10,5};
		int target = 10;
		boolean status = false;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1+1;j<arr.length;j++) {
				
				if(arr[i]+ arr[j]==target) {
					System.out.println(i+ " " + j);
					status = true;
				}
			}
			
			if(status) {
				break;
			}
		}
	}

}
