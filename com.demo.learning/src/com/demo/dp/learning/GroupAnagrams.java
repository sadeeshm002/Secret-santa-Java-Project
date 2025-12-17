package com.demo.dp.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Map<String, List<String>> map = new HashMap<>();

		for (String word : strs) {
			char[] charArr = word.toCharArray();
			Arrays.sort(charArr);
			String str = new String(charArr);
//			map.putIfAbsent(str, new ArrayList<String>());
//			map.get(str).add(word);

			map.computeIfAbsent(str, k -> new ArrayList<>()).add(word);

		}
		System.out.println(new ArrayList<>(map.values()));
	}

}
