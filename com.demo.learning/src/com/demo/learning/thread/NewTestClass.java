package com.demo.learning.thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class NewTestClass {

	public static NewTestClass instance;

	private NewTestClass() {

	}

	public static NewTestClass getInstance() {

		if (Objects.isNull(instance)) {
			instance = new NewTestClass();
		}
		return instance;

	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'b', 'c', 'a', 'b','c' };
		char result[] = new char[arr.length];
		Queue<Character> queue = new LinkedList<>();
		result[0] = arr[0];
		queue.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (!queue.isEmpty()) {
				if (!queue.contains(arr[i])) {
					queue.add(arr[i]);
				}
				if (arr[i] == queue.peek()) {
					queue.poll();
					result[i] = queue.isEmpty()?Character.valueOf('1'):queue.peek();
					
				} else {
					result[i] = queue.peek();
				}
			}
			else {
				result[i] = arr[i];
				queue.add(arr[i]);
			}


		}

		System.out.println(Arrays.toString(result));
	}

}
