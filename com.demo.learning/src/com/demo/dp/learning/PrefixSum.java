package com.demo.dp.learning;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		int[] arr = { -2, 0, 3, -5, 2, -1};
		int[] prefixSum = prefixSum(arr);

		System.out.println(querySum(prefixSum, 0, 2));

	}

	private static int querySum(int[] pre, int start, int end) {

		if (start == 0) {
			return pre[end];
		} else {
			return pre[end] - pre[start - 1];
		}

	}

	private static int[] prefixSum(int[] arr) {
		int n = arr.length;
		int pre[] = new int[n];
		pre[0] = arr[0];
		for (int i = 1; i < n; i++) {
			pre[i] = pre[i - 1] + arr[i];
		}

		System.out.println(Arrays.toString(pre));

		return pre;
	}

}
