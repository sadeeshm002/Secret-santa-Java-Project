package com.demo.learning.dsa.sortandsearch;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {

		int n = arr.length, temp;

		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

//		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));
		System.out.println(Arrays.toString(InsertionSort.insertionSort(arr)));

		System.out.println(BinarySearch.binarySearch(arr, 25));
	}

}
