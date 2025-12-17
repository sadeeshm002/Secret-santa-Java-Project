package com.demo.learning.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindThirdLargest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 1, 1, 2, 3, 3, 4, 5, 6, 7);
//		list.add(10);
//		list.add(30);
//		list.add(20);
//		list.add(40);

		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		Optional<Integer> val = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();
		if(val.isPresent()) {
			System.out.println(val.get());
		}
		else {
			System.out.println("no val");
		}
		
		System.out.println(list2.get(2));

		List<String> list3 = Arrays.asList("apple", "banana", "apple", "banana", "orange", "apple");
		int curr = 0, max = Integer.MIN_VALUE;
		String result = "";
		Map<String, Integer> map = new HashMap<>();
		for (String str : list3) {
			map.put(str, map.getOrDefault(str, 0) + 1);

			curr = map.get(str);

			if (max < curr) {
				max = curr; 
				result = str;
			}
		}

		System.out.println(result);
		
		 List<Integer> list4 =  list.stream().sorted().collect(Collectors.toList());

	}

}
