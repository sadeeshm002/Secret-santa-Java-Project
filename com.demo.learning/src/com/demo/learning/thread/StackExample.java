package com.demo.learning.thread;

import java.util.Stack;

public class StackExample {
	
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.toString());
		
		Integer peek = stack.peek();
		
		System.out.println(stack.toString());
		
		Integer pop = stack.pop();
		
		System.out.println(pop);
		System.out.println(stack.toString());
	}

}
