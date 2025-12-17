package com.demo.learning.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		System.out.println(isBalnced("{[()]()}"));
	}

	private static Boolean isBalnced(String val) {

		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		for (Character c : val.toCharArray()) {
			if (map.containsKey(c)) {
				stack.push(c);
			} else if (map.containsValue(c)) {
				if (stack.isEmpty() || stack.pop() != map.get(c)) {
					return false;
				}
			}

		}

		return stack.isEmpty();
	}

//	public static Boolean isBalnced(String val) {
//		Stack<Character> stack = new Stack<>();
//		Map<Character, Character> map = new HashMap<>();
//		map.put('}', '{');
//		map.put(']', '[');
//		map.put(')', '(');
//
//		for (Character c : val.toCharArray()) {
//			if (map.containsValue(c)) {
//				stack.push(c);
//			} else if (map.containsKey(c)) {
//				if (stack.isEmpty() || stack.pop() != map.get(c)) {
//					return false;
//				}
//			}
//		}
//
//		return stack.isEmpty();
//	}

}
