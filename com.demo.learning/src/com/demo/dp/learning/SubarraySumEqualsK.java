package com.demo.dp.learning;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		int[] nums = { 1,-1,0 };

		int n = nums.length;

		int k = 0, count = 0;

//		for (int i = 0; i < n; i++) {
//			int sum = nums[i];
//			if (sum == k) {
//				count++;
//			}
//			for (int j = i + 1; j < n; j++) {
//				sum += nums[j];
//				if (sum == k) {
//					count++;
//				}
//			}
//		}
//
//		System.out.println(count);

		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			sum += nums[i];

			if (sum == k) {
				count++;
			} 
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}

			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		System.out.println(count);

//		int n = nums.length;
//		int k = 3, count = 0, sum = 0;
//
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < n; i++) {
//
//			sum += nums[i];
//
//			if (sum == k) {
//				count++;
//			} else if (map.containsKey(sum - k)) {
//				count += map.get(sum - k);
//			}
//			map.put(sum, map.getOrDefault(sum - k, 0) + 1);
//		}

//		System.out.println(count);

	}

}
