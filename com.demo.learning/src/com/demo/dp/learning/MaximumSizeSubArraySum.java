package com.demo.dp.learning;

import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubArraySum {

	public static void main(String[] args) {
		int[] arr = { 1, -1, 5, -2, 3 };
		int k = 3, sum = 0, max = 0, n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			sum += arr[i];
			if (sum == k) {
				max = i + 1;
			}

			if (map.containsKey(sum - k)) {
				max = Math.max(max, i - map.get(sum - k));
			}

			map.putIfAbsent(sum, i);
		}
		
		System.out.println(max);
	}

}
