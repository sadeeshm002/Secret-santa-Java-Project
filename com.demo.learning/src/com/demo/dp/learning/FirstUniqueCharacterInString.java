package com.demo.dp.learning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {

//		String s = "leetcode";
//
//		Map<Character, Integer> map = new HashMap<>();
//
//		for (Character c : s.toCharArray()) {
//			map.put(c, map.getOrDefault(c, 0) + 1);
//		}
//
//		for (int i = 0; i < s.length(); i++) {
//			if (map.get(s.charAt(i)) == 1) {
//				System.out.println(i);
//				break;
//			}
//		}
		
//		int nums[] = { 2, 7, 11, 15 };
//		int target = 9;
//
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < nums.length; i++) {
//			int val = target - nums[i];
//
//			if (map.containsKey(val)) {
//				System.out.println(Arrays.toString(new int[] { map.get(val), i }));
//			}
//
//			map.put(val, i);
//		}
//
//		System.out.println(Arrays.toString(new int[] {}));
		
		
//		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
//		int currSum=0,maxSum=Integer.MIN_VALUE;
//		
//		for(int i=0;i<nums.length;i++) {
//			currSum = Math.max(currSum+nums[i], nums[i]);
//			maxSum = Math.max(maxSum, currSum);
//		}
//		
//		System.out.println(maxSum);
		
//		int k=2,currsum=0,maxSum=0;
//		
//		for(int i=0;i<k;i++) {
//			currsum += nums[i];
//		}
//		maxSum = currsum;
//		
//		for(int i=k;i<nums.length;i++) {
//			currsum = currsum+nums[i]-nums[i-k];
//			maxSum = Math.max(maxSum, currsum);
//		}
//		
//		System.out.println(maxSum);
		
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 }; //4,5,6,7,1,2,3
		int k = 3;
		int n = nums.length;
		
		reverse(nums, 0, k-1);
		reverse(nums,k,n-1);
		reverse(nums,0,n-1);		
		
		System.out.println(Arrays.toString(nums));
		
		
		
	
	}

	private static void reverse(int[] nums, int start, int end) {
        int temp;
		while (start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			
			start++;
			end--;
		}
	}

}
