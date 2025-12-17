package com.demo.dp.learning;

public class MinCostClimbing {

	public static void main(String[] args) {
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 1, 100 };
		int n = cost.length;

		int dp[] = new int[n];

		dp[0] = cost[0];
		dp[1] = cost[1];

		for (int i = 2; i < n; i++) {
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
			System.err.println(dp[i]);
		}

		System.out.println(Math.min(dp[n - 1], dp[n - 2]));

	}

}
