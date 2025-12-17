package com.demo.dp.learning;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abcabcbb";
		int n = str.length(), j = 0, max = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			while (set.contains(str.charAt(i))) {
				set.remove(str.charAt(j));
				j++;
			}
			set.add(str.charAt(i));
			max = Math.max(max, i + 1 - j);
		}

		System.out.println(max);
	}

}
