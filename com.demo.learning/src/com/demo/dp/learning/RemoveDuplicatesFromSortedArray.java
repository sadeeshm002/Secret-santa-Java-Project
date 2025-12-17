package com.demo.dp.learning;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		int n = nums.length;
		int[] result = new int[n];
		int low = 1, count = 1;
		result[0] = nums[0];

		while (low < n) {
			if (nums[low] != nums[low - 1]) {
				count++;
			}
			low++;
		}

		System.out.println(count);
	}

}
