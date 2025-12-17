package com.demo.dp.learning;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9 };
		int n = arr.length;

//		int dp[] = new int[n];
//		Arrays.fill(dp, 1);
//
//		for (int i = 1; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				if (arr[i] > arr[j]) {
//					dp[i] = Math.max(dp[i], dp[j] + 1);
//				}
//			}
//		}
//
//		System.out.println(dp[n - 1]);
		
		int dp[] = new int[n];
		Arrays.fill(dp, 1);
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		
		System.out.println(dp[n-1]);

	}

}
