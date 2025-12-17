package com.demo.dp.learning;

public class MaxPathSum {

	private int maxSum;

	public int maxPath(TreeNode root) {
		maxSum = Integer.MIN_VALUE;
		dfs(root);
		return maxSum;
	}

	private int dfs(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int left = Math.max(0, dfs(root.left));
		int right = Math.max(0, dfs(root.right));

		int through = root.val + left + right;

		maxSum = Math.max(maxSum, through);

		return root.val + Math.max(right, left);
	}

}
