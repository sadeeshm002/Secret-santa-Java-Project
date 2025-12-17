package com.demo.learning.dsa;

public class BinarySearchExample {

	public static int binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			System.out.println(arr[mid]);

			if (arr[mid] == key)
				return mid;
			else if (arr[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9 };
		int key = 8;
		int index = BinarySearchExample.binarySearch(arr, key); // Java built-in method
		System.out.println("Element found at index: " + index);

	}

}
