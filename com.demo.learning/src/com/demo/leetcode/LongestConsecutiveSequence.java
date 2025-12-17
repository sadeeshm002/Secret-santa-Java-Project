package com.demo.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {

		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		int currentNum, longStreak = 0, currentStreak;
		for (Integer num : set) {

			if (set.contains(num - 1)) {
				currentNum = num;
				currentStreak = 1;
				while (set.contains(currentNum)) {
					currentStreak++;
					currentNum++;
				}

				longStreak = Math.max(longStreak, currentStreak);
			}
		}
		
		return longStreak;

//		int[] result = Arrays.stream(nums).distinct().sorted().toArray();
//		int count = 1;
//		int l = 1;
//
//		for (int i = 0; i < result.length - 1; i++) {
//			if (result[i] + 1 != result[i + 1]) {
//				l = Math.max(l, count); // l <count?count:l;
//				count = 1;
//
//			} else {
//				count++;
//			}
//		}
//		return Math.max(l, count);

//		if (nums == null || nums.length == 0)
//			return 0;
//
//		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//
//		int longSteak = 0;

//		for (Integer num : set) {
//
//			if (!set.contains(num - 1)) {
//				int currentNum = num;
//				int currentSteak = 1;
//
//				while (set.contains(currentNum+1)) {
//					currentNum++;
//					currentSteak++;
//				}
//
//				longSteak = Math.max(longSteak, currentSteak);
//			}
//		}
//
//		return longSteak;

	}

	public static void main(String[] args) {

		int[] nums = { 100, 4, 200, 1, 3, 2 };
//		int[] nums = { 7, 1, 9, 11, 3, 2, 8, 10 };

		System.out.println(longestConsecutive(nums));
	}

}
