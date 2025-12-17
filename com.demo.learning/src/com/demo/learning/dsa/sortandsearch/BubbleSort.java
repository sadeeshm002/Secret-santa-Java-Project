package com.demo.learning.dsa.sortandsearch;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			// if already sorted we no need to loop
			if (!swapped) {
				break;
			}
		}

		return arr;
	}

}
