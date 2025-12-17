package com.demo.dp.learning;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {

	public static void main(String[] args) {

		int[] nums = { 5, 25, 75 };

		int n = nums.length;

		int t = 100, high = n - 1, low = 0, currSum = 0;

		while (low < high) {
			currSum = nums[low] + nums[high];
			if (t == currSum) {
				System.out.println(Arrays.toString(new int[] { low, high }));
				break;
			} else if (t > currSum) {
				low++;
			} else if (t < currSum) {
				high--;
			}
		}

		System.out.println(new int[] {});

	}

}
