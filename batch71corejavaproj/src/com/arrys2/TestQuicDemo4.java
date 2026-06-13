package com.arrys2;

public class TestQuicDemo4 {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 21, 30, 25, 17, 5, 8 };

		quickSort(arr, 0, arr.length - 1);

		for (int a : arr) {
			System.out.println(a);
		}

	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(arr, low, high);

			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);

		}

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[low];
		int start = low;
		int end = high;

		while (start < end) {

			while (start < high && arr[start] < pivot) {
				start++;
			}

			while (arr[end] > pivot) {
				end--;
			}

			if (start < end) {
				swap(arr, start, end);
			}

		}

		return end;
	}

	private static void swap(int[] arr, int low, int high) {

		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;

	}

}
