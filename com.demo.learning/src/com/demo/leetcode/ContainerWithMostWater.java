package com.demo.leetcode;

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {

//		int max = -1;
//		int right = height.length - 1;
//		int left = 0;
//
//		while (left < right) {
//			int w = right - left;
//			int h = Math.min(height[left], height[right]);
//			max = Math.max(max, h * w);
//
//			if (height[left] < height[right]) {
//				left++;
//			} else {
//				right--;
//			}
//		}
//
//		return max;

		int low = 0, max = Integer.MIN_VALUE, sum = 0;
		int high = height.length - 1;

		while (low < high) {
			sum = (high - low) * Math.min(height[high], height[low]);

			max = Math.max(max, sum);

			if (height[high] < height[low]) {
				high--;
			} else {
				low++;
			}
		}
		return max == Integer.MIN_VALUE ? 0 : max;

	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		System.out.println(maxArea(height));

	}

}
