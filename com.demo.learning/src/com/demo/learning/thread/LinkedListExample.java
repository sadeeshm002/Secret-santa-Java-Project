package com.demo.learning.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListExample {
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(Arrays.asList(0,2,1,3,4)); 
//		System.out.println(list);
//		
//		list.add(4, 5);
//		
//		System.out.println(list);
//		
//		list .remove(2);
//		System.out.println(list);
//		list.remove(Integer.valueOf(5));
//		
//		System.out.println(list);
		
//		int a = 127;
//		int b = 128;
//		int c = 127;
//		
//		if(a==b) {
//			System.out.println("equal");
//		}
//		else {
//			System.out.println("not equal");
//		}
		
//		if(a.equals(b)) {
//			System.out.println("method equal");
//		}
//		else {
//			System.out.println("method not equal");
//		}
		
		
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(0,2,1,3,4));
		
		for(Integer a : linkedList) {
			   System.out.println(a);
			   }
		
//	   Collections.reverse(linkedList);
	   
	   for(int i=linkedList.size()-1;i>=0;i--) {
	   System.out.print(linkedList.get(i));
	   }
		
	   linkedList.addFirst(null);
	   linkedList.addLast(null);
	   linkedList.removeFirst();
		
		
		
	}

}
