package com.demo.dp.learning;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		int left = 0, right = nums.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[right] < nums[mid]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		System.out.println(nums[left]);
	}

}
