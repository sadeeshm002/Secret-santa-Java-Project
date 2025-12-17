package com.demo.dp.learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static void main(String[] args) {
//
//		int[] arr = { -1, 1, 1, 1, 1, 1, -1, -1, -1};
//		int low = 0, high = 0, sum = 0, max = Integer.MIN_VALUE;
//
//		while (high < arr.length) {
//			
//
//		}
//
//		System.out.println(max);

//		int[] arr = { -1, 1, 1, 1, 1, 1, -1, -1, -1 , -1,1,2};
//		int n = arr.length;
//		int n = arr.length, sum = 0, max = 0;
//		for (int i = 0; i < n; i++) {
//			sum = arr[i];
//			if (sum == 0) {
//				max = Math.max(max, 1);
//			}
//			for (int j = i + 1; j < n; j++) {
//				sum += arr[j];
//				if (sum == 0) {
//					max = Math.max(max, j + 1 - i);
//				}
//			}
//		}

//		System.out.println(max);
//		int res[] = new int[n];
//		res[0] = arr[0];
//
//		for (int i = 1; i < n; i++) {
//			res[i] = res[i - 1] + arr[i];
//		}

//		System.out.println(Arrays.toString(res));
//
//		int[] arr1 = { -1, 1, 1, 1, 1, 1, -1, -1, -1, -1, 1, 2 }; // [-1, 0, 1, 2, 3, 4, 3, 2, 1]
//		int n1 = arr1.length, sum = 0, max = 0, k = 1;
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < n1; i++) {
//			sum += arr1[i];
//
//			if (sum == k) {
//				max = i + 1;
//			}
//
//			if (map.containsKey(sum - k)) {
//				max = Math.max(max, i - map.get(sum - k));
//			}
//
//			map.putIfAbsent(sum, i);
//		}
//
//		System.out.println(max);

		int[] arr = { 0, 1, 1, 1, 1, 1, 0, 0, 0 };

		int n = arr.length, max = 0, sum = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			sum += arr[i] == 0 ? -1 : arr[i];

			if (sum == 0) {
				max = i + 1;
			}

			if (map.containsKey(sum)) {
				max = Math.max(max, i - map.get(sum));
			}

			map.putIfAbsent(sum, i);
		}

		System.out.println(max);

	}

}
