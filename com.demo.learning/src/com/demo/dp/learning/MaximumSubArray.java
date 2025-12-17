package com.demo.dp.learning;

public class MaximumSubArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int n = arr.length;

		int k = 2;

		int currSum = 0, maxSum = 0;

		for (int i = 0; i < k; i++) {
			currSum += arr[i];
		}

		maxSum = currSum;

		for (int i = k; i < n; i++) {
			currSum = currSum + arr[i] - arr[i - k];

			maxSum = Math.min(currSum, maxSum);
		}

		System.out.println(maxSum);
	}
}
