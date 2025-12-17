package com.demo.learning.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplecatesInArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,2,1};
		
		
		List<Integer> list = new ArrayList<>();
		
//		for(int i=0;i<arr.length-1;i++) {
//			if(!list.contains(arr[i])) {
//				boolean add = list.add(arr[i]);
//				System.out.println(add);
//			}
//			else {
//				System.out.println(arr[i]);
//			}
//		}
//		int[] array = list.stream().mapToInt(Integer::intValue).toArray();
		
		int[] array = Arrays.stream(arr).distinct().toArray();
	}
	
	

}
