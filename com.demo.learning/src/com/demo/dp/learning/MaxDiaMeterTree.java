package com.demo.dp.learning;

public class MaxDiaMeterTree {

	private int max;

	public int maxDia(TreeNode root) {
		max = 0;
		dfs(root);
		return max;

	}

	private int dfs(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = dfs(root.left);
		int rightHeight = dfs(root.right);

		max = Math.max(max, leftHeight + rightHeight);

		return 1 + Math.max(leftHeight, rightHeight);

	}

}
