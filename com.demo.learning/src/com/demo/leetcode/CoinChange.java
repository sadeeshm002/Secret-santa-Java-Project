package com.demo.leetcode;

import java.util.Arrays;

public class CoinChange {

	public static int coinChange(int[] coins, int amount) {

//		int max = amount + 1;
//		int dp[] = new int[max];
//		Arrays.fill(dp, max);
//		dp[0] = 0;
//		for (int i = 1; i < dp.length; i++) {
//			for (int coin : coins) {
//				if (i >= coin && dp[i - coin] != max) {
//					dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//				}
//			}
//		}
//
//		return dp[amount] == max ? -1 : dp[amount];

		int max = Integer.MAX_VALUE;
		int arr[] = new int[amount + 1];
		Arrays.fill(arr, max);
		arr[0] = 0;
		for (int i = 0; i < amount + 1; i++) {
			for (int coin : coins) {
				if (i >= coin && arr[i - coin] != max) {
					arr[i] = Math.min(arr[i], arr[i - coin] + 1);
				}
			}
		}
		return arr[amount] == max ? -1 : arr[amount];

	}

	public static void main(String[] args) {

		int[] coins = { 1, 3, 4 };
		int amount = 6;
		System.out.println("Min coins needed: " + coinChange(coins, amount));

	}

}
