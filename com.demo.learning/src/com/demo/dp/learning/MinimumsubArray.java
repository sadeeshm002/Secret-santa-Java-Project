package com.demo.dp.learning;

public class MinimumsubArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5 };
		int k = 2, currSum = 0, min;

		for (int i = 0; i < k; i++) {
			currSum += nums[i];
		}
		min = currSum;

		int n = nums.length;
		for (int i = k; i < n; i++) {
			currSum += nums[i] - nums[i - k];
			min = Math.min(min, currSum);
		}

		System.out.println(min);
	}

}
