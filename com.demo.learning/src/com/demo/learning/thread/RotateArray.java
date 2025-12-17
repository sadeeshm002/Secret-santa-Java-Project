package com.demo.learning.thread;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RotateArray {

	public static void main(String[] args) {
//		int arr[] = {1,8,2,3,5,4};
		int arr[] = {1,2,2,2,4,4,4,4,7,5};
		int k=2;
		int n = arr.length;
		int temp[] = new int[n];
		for(int i=0;i<n;i++) {
//			int val= i+k>=n?i+k-n:i+k;
			int val = i-k<0?i-k+n:i-k;
			temp[val]=arr[i];
		}
		
		for(int val :temp) {
			System.out.print(val);
		}
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("\n"+sum);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int val : arr) {
			if(map.containsKey(val)) {
				Integer val1 = map.get(val)+1;
				map.put(val, val1);
				
			}
			else {
				map.put(val, 1);
			}
		}
		
		int max = 0;
		int result =0;
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			int tempVal = entry.getValue();
			 if(max<tempVal) {
				 max= tempVal;
				 result= entry.getKey();
			 }
		}
		
		System.out.println(result);
	}
	
}
