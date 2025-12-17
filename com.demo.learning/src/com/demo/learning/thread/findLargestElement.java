package com.demo.learning.thread;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class findLargestElement {

	public static void main(String[] args) {

		int arr[] = {1,3,8,4,5};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		
		int val = Arrays.stream(arr).max().getAsInt();
		System.out.println(val);
		
		
	}

}
