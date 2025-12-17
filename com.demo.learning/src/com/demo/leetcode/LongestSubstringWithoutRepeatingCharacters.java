package com.demo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {

		Set<Character> set = new HashSet<>();
		int j = 0, maxLen = 0;
		for (int i = 0; i < s.length(); i++) {

			while (set.contains(s.charAt(i))) {
				set.remove(s.charAt(j));
				j++;
			}
			
			set.add(s.charAt(i));

			maxLen = Math.max(maxLen, i - j + 1);
		}
		return maxLen;

	}

	public static void main(String[] args) {
		String s = "abcdb";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
