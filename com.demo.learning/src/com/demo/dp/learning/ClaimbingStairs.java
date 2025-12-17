package com.demo.dp.learning;

public class ClaimbingStairs {

	public static void main(String[] args) {
		int n = 1;
		if (n <= 1) {
			System.out.println(n);
			return;
		}
		int prev2 = 0;
		int prev1 = 1;
		for (int i = 1; i <= n; i++) {
			int curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}

		System.out.println(prev1);
	}
}
