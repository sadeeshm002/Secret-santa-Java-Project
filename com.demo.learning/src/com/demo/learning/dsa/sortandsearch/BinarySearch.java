package com.demo.learning.dsa.sortandsearch;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {

		int n = arr.length;
		int low = 0, high = n - 1, mid;

		while (low < high) {
			mid = high - low / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}

		return -1;

	}

}
