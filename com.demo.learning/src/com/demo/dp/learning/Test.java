package com.demo.dp.learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.left.right = new TreeNode(3);
//		root.right.right = new TreeNode(1);

//		HouseRobberIII solver = new HouseRobberIII();
//		System.out.println(solver.rob(root));

//		TreeNode root = new TreeNode(-10);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//
//        // run solver
//        MaxPathSum solver = new MaxPathSum();
//        System.out.println("Maximum Path Sum: " + solver.maxPath(root));

//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(5);
//		
//		MaxDiaMeterTree solver = new MaxDiaMeterTree();
//		System.out.println(solver.maxDia(root));

//		int arr[] = { 4, 3, 3, 5, 7, 8, 2 };
//		int k = 9;
//		int n = arr.length;
//		int low = 0, high = 0, sum = 0, min = Integer.MAX_VALUE;
//
//		while (high < n) {
//			sum += arr[high];
//
//			while (sum >= k) {
//				if (sum == k) {
//					min = Math.min(high + 1 - low, min);
//				}
//				sum = sum - arr[low];
//				low++;
//			}
//			high++;
//		}
//
//		System.out.println(min==Integer.MAX_VALUE ?0:min);

//		int[] nums = { 3, 2, 3 };
//		int target = 6, n = nums.length;
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < n; i++) {
//			int key = target - nums[i];
//			if (map.containsKey(key)) {
//				System.out.println(Arrays.toString(new int[] { map.get(key), i }));
//			}
//			map.put(nums[i], i);
//		}
//
//		System.out.println(Arrays.toString(new int[] {}));

//		int[] nums = { 3, 4, 7, 2, -3, -1, 4, 2,3 };
//
//		int n = nums.length;
//
//		int k = 7, count = 0, sum = 0;
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < n; i++) {
//			sum += nums[i];
//
//			if (sum == k) {
//				count++;
//			} else if (map.containsKey(sum - k)) {
//				count += map.get(sum - k);
//			}
//
//			map.put(sum, map.getOrDefault(sum - k, 0) + 1);
//		}
//		
//		System.out.println(count);

//		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		int n=arr.length,sum=0,max=Integer.MIN_VALUE;
//		for(int i=0;i<n;i++) {
//			sum=Math.max(sum+arr[i],arr[i]);
//			max = Math.max(max, sum);
//		}
//		
//		System.out.println(max);

//		int arr[] = { 1, 2, 3, 4, 5 };
//		int k = 2;
//		int n = arr.length, sum = 0, min = Integer.MAX_VALUE;
//		for (int i = 0; i < k; i++) {
//			sum += arr[i];
//		}
//		min = sum;
//		for (int i = k; i < n; i++) {
//			sum += arr[i] - arr[i - k];
//			min = Math.min(min, sum);
//		}
//		
//		System.out.println(min);
		
		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		int n = nums.length, low = 1, count = 1;

		while (low < n) {
			if (nums[low] != nums[low - 1]) {
               nums[count] = nums[low];
				count++;
			}
			low++;
		}
		

		System.out.println(Arrays.toString(nums));

	}

}
 