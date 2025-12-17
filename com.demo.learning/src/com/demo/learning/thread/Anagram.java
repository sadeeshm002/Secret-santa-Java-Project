package com.demo.learning.thread;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("listenee", "silent"));

//		Queue<String> pq = new PriorityQueue<>();
//		pq.add("Hello");
//		pq.add("Hackerrank");
//
//		String s1 = pq.poll(); // removes and returns head
//		pq.remove(); // removes head
//		System.out.println(s1);
//
//		String s2 = pq.remove(); // removes head and returns
//		System.out.println(s2);

	}

	public static Boolean isAnagram(String val1, String val2) {
		if (val1.length() != val2.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : val1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Character ch : val2.toCharArray()) {
			if (!map.containsKey(ch)) {
				return false;
			}
			map.put(ch, map.get(ch) - 1);
			if (map.get(ch) == 0) {
				map.remove(ch);
			}
		}

		return map.isEmpty();

//		char[] arr1 = val1.toCharArray();
//		
//		Arrays.sort(arr1);
//		
//		char[] arr2 = val2.toCharArray();
//		Arrays.sort(arr2);

//		for(int i=0;i<val1.length();i++) {
//			if(arr1[i]!=arr2[i]) {
//				return false;
//			}
//		}

//		return Arrays.equals(arr1, arr2);

	}
}

class Generic<T> {
	private T value;

	public Generic(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}
