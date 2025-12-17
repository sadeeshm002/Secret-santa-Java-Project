package com.demo.learning.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		for (Entry<String, String> entry : map.entrySet()) {

		}
		
		List<Employee>nlist = new ArrayList<>();
		
		List<String> collec111 = nlist.stream().map(n-> n.getName()).collect(Collectors.toList());
		
		Map<Integer, String> empMap = nlist.stream().collect(Collectors.toMap(Employee:: getAge, Employee:: getName));
		
		

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 8));
		
		Collections.sort(list, Collections.reverseOrder());
		list.forEach(l -> System.out.println(l));

		List<String> lines = Arrays.asList("java spring", "microservices cloud");

		List<String> collect = lines.stream().flatMap(line -> Arrays.asList(line.split(" ")).stream())
				.collect(Collectors.toList());

		lines.stream().filter(line -> line.startsWith("abc")).collect(Collectors.toList());

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		
		}

		Integer a = 10;
		Integer b = 10;
		if (a == b) {
			System.out.println("true");
		}
		
		 List<String> names = new ArrayList<>();
	        names.add("A");
	        names.add("B");
	        names.add("C");
	        names.add("D");

	        // Trying to remove using for-each
	        for (String name : names) {
	            if (name.equals("D")) {
	                names.remove(name); // ❌ Causes ConcurrentModificationException
	            }
	        }

	        
	        names.forEach(l -> System.out.println(l));
	}

}
