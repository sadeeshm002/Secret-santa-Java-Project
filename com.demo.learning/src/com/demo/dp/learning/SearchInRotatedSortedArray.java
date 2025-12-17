package com.demo.dp.learning;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 7, 8, 1, 2, 3 }; // { 4, 5, 6, 7, 0, 1, 2 };
		int n = nums.length, k = 8, left = 0, right = n - 1, mid = 0;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (nums[mid] == k) {
				System.out.println(mid);
			}

			if (nums[left] <= nums[mid]) {

				if (k >= nums[left] && k < nums[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (k > nums[mid] && k <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		System.out.println(-1);
	}

}
