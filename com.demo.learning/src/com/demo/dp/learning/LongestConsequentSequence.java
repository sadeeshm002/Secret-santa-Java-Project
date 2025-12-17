package com.demo.dp.learning;

import java.util.Arrays;

public class LongestConsequentSequence {

	public static void main(String[] args) {

		String text1 = "abcde";
		String text2 = "ace";

		int m = text1.length();
		int n = text2.length();
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i < n + 1; i++) {
			dp[0][i] = 0;
		}

		for (int j = 0; j < m + 1; j++) {
			dp[j][0] = 0;
		}

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		for (int i = 0; i < m+1; i++) {
			System.err.println();
			for (int j = 0; j < n+1; j++) {
				System.err.print(dp[i][j]);
			}
		}

		System.out.println(dp[m][n]);
	}

}
