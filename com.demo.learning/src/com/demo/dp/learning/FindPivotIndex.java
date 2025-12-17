package com.demo.dp.learning;

public class FindPivotIndex {

	public static void main(String[] args) {
		int nums[] = { 1, 7, 3, 6, 5, 6 };

		int n = nums.length;

		int pre[] = new int[n];
		pre[0] = nums[0];
		for (int i = 1; i < n; i++) {
			pre[i] = pre[i - 1] + nums[i];
		}

		if (pre[n - 1] == 0) {
			System.out.println(0);
		}

		for (int j = 1; j < n; j++) {
			if (pre[j - 1] == (pre[n - 1] - pre[j])) {
				System.out.println(j);
			} else {
				System.out.println(-1);
			}
		}
	}

}
