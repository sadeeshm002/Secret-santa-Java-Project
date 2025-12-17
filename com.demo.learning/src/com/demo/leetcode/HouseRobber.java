package com.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class HouseRobber {

	public static int rob(int[] nums) {

		int l = nums.length;
		if (l == 0)
			return 0;
		if (l == 1)
			return nums[0];

		int arr[] = new int[l];
		arr[0] = nums[0];
		arr[1] = Math.max(nums[0], nums[1]);

		for (int i = 2; i < l; i++) {
			arr[i] = Math.max(arr[i - 1], arr[i - 2] + nums[i]);
		}

		return arr[l - 1];

	}

	public static int rob(int[] nums, int start, int end) {

		int arr[] = new int[end + 1];
		arr[start] = nums[start];
		arr[start + 1] = Math.max(nums[start], nums[start + 1]);

		for (int i = start + 2; i <= end; i++) {
			arr[i] = Math.max(arr[i - 1], arr[i - 2] + nums[i]);
		}

		return arr[end];

	}

	public static void main(String[] args) {

		int[] nums = { 2, 1,2};

		int length = nums.length;
		int rob1 = rob(nums, 0, length - 2);
		int rob2 = rob(nums, 1, length - 1);
		
		System.out.println(Math.max(rob1, rob2));

//		List<Integer> list = new ArrayList<>();
//		list.stream().max((a,b)-> (a-b)).get();
//		
//		 int max = Arrays.stream(nums).max().getAsInt();
//		System.out.println(rob(nums));

	}

}
