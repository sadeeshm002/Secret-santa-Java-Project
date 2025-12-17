package com.demo.dp.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenArray {

	public static List<Object> flatten(Object[] objects) {
		List<Object> list = new ArrayList<>();
		for (Object element : objects) {
			if (element instanceof Object[]) {
				list.addAll(flatten((Object[]) element));
			} else {
				list.add(element);
			}
		}
		return list;

	}

	public static void main(String[] args) {
		Object[] deeplyNestedArray = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };

		List<Object> flatten = flatten(deeplyNestedArray);

//		System.out.println(flatten.toString());
		
		   String[][] nestedArrays = {
		            {"Object1", "Object2"},
		            {"Object3"},
		            {"Object4", "Object5", "Object6"}
		        };
		   
		   List<String> collect = Arrays.stream(nestedArrays).flatMap(Arrays::stream).collect(Collectors.toList());
		   
		   System.out.println(collect.toString());
	}
}
