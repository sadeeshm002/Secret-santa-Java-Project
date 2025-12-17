package com.demo.dp.learning;

public class HouseRobberIII {

	public int rob(TreeNode root) {
		int[] rob = dfs(root);
		return Math.max(rob[0], rob[1]);
	}

	private int[] dfs(TreeNode root) {

		if (root == null) {
			return new int[] { 0, 0 };
		}
		int[] left = dfs(root.left);
		int[] right = dfs(root.right);

		int rob = root.val + left[1] + right[1];

		int skip = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

		return new int[] { rob, skip };
	}

}

class TreeNode {

	int val;
	TreeNode left, right;

	public TreeNode(int val) {
		this.val = val;
	}
}
