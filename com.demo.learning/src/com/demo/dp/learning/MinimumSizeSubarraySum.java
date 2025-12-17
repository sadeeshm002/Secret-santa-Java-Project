package com.demo.dp.learning;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 2, 4, 3 };
		int n = arr.length;
//		int k = 7, low = 0, high = 0, minSize = Integer.MAX_VALUE, currSum = 0;
//
//		while (high < n) {
//			currSum += arr[high];
//			high++;
//
//			while (currSum >= k) {
//				minSize = Math.min(minSize, high - low);
//				currSum -= arr[low];
//				low++;
//			}
//		}
//
//		System.out.println(minSize == Integer.MAX_VALUE ? 0 : minSize);
		
		int k = 7, low = 0, high = 0, minSize = Integer.MIN_VALUE, currSum = 0;

		while (high < n) {
			currSum += arr[high];
			high++;

			while (currSum >= k) {
				minSize = Math.max(minSize, high - low);
				currSum -= arr[low];
				low++;
			}
		}

		System.out.println(minSize == Integer.MIN_VALUE ? 0 : minSize);
	}

}
