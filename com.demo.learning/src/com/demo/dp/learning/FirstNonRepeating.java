package com.demo.dp.learning;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeating {

	public static void main(String[] args) {

		char[] arr = { 'a', 'a', 'b', 'c', 'a', 'b' }; // a,-,b,b,b,b
		int n = arr.length;

		Map<Character, Integer> map = new HashMap<>();
		Queue<Character> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			queue.offer(arr[i]);
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			while (!queue.isEmpty() && map.get(queue.peek()) > 1) {
				queue.poll();
			}
			if (queue.isEmpty()) {
				System.out.println("-");
			} else {
				System.out.println(queue.peek());
			}
		}

//		Map<Character, Integer> map = new HashMap<>();
//
//		Queue<Character> queue = new LinkedList<>();
//
//		for (int i = 0; i < n; i++) {
//			queue.offer(arr[i]);
//			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//			while (!queue.isEmpty() && map.get(queue.peek()) > 1) {
//				queue.poll();
//			}
//			if (queue.isEmpty()) {
//				System.out.println("-1");
//			} else {
//				System.out.println(queue.peek());
//			}
//		}

	}

}
