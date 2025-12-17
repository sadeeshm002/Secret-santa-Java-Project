package com.demo.leetcode;

public class UniquePathsII {

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int l = obstacleGrid.length;
		int arr[][] = new int[l][];

		for (int i = 0; i < l; i++) {
			int innerLength = obstacleGrid[i].length;
			arr[i] = new int[innerLength];
			for (int j = 0; j < innerLength; j++) {
				if (i == 0 || j == 0) {
					if (obstacleGrid[i][j] == 1) {
						if (i == 0) {
							int k = (j == 0) ? 0 : j - 1;
							arr[i][j] = obstacleGrid[i][k];
						} else if (j == 0) {
							int k = i == 0 ? 0 : i - 1;
							arr[i][j] = obstacleGrid[k][j];
						}
					} else {
						arr[i][j] = 1;
					}
				} else if (obstacleGrid[i][j] == 1) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
				}
			}
		}

		return arr[l - 1][obstacleGrid[l - 1].length - 1];

	}

	public static void main(String[] args) {

		int[][] arr = { { 0, 1 }, { 0, 0 } };
		System.out.println(uniquePathsWithObstacles(arr));
	}

}
