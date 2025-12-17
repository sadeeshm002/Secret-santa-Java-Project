package com.demo.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

//		int l = nums.length;
//		for (int i = 0; i < l ; i++) {
//			for(int j=0;j<l;j++) {
//				if(i==j) {
//					continue;
//				}			
//				if(target == nums[i]+nums[j]) {
//					return new int[] { i, j };
//				}				
//			}
//		}
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int l = nums.length;
		for (int i = 0; i < l ; i++) {
			int complement = target - nums[i] ;
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			
			map.put(complement, i);
		}
		

		return new int[] {};
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {3,2,3};
		int target = 6;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
