package com.demo.learning.plmxml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.BiPredicate;

public class Test {

	
	public static void main(String[] args) {
		
//		String input = "[2024/03/15-02:32:06:063, 2024/03/18-09:23:43:134]";
//		
//		StringJoiner stringJoiner = new StringJoiner(",");
//		stringJoiner.add(input.replaceAll("[\\[\\]]", ""));
//		System.out.println(stringJoiner);
		
//		Employee employee = new Employee();
//		employee.setAge(Objects.isNull(employee.getAge())? 10:employee.getAge()+1);
//		System.out.println(employee.getAge());
		
//		getValue();
//		List<Employee> employeeList = Arrays.asList(
//		new Employee("E001", "Alice Johnson", 30, "Female", "D"),
//		new Employee("E002", "Bob Smith", 45, "Male", "M"),
//		new Employee("E003", "Charlie Lee", 28, "Male", "D"),
//		new Employee("E004", "Diana Ray", 35, "Female", "D"),
//		new Employee("E005", "Evan Cole", 40, "Male", "D"),
//		new Employee("E006", "Fiona Green", 26, "Female", "D"),
//		new Employee("E007", "George Hill", 32, "Male", "D"),
//		new Employee("E008", "Hannah King", 29, "Female", "D"),
//		new Employee("E009", "Ivan Drake", 38, "Male", "D"),
//		new Employee("E010", "Julia Snow", 31, "Female", "PO"));
//		
//		HashMap<String, List<Employee>> employeMap = new HashMap<String, List<Employee>>();
//		
//		employeeList.stream().forEach(e->{
//			employeMap.computeIfAbsent(e.getId(),k-> new ArrayList<Employee>());
//		});
//		System.out.println(employeMap.keySet().size());

//		String val = "C540    982101 4200 0010";
		
//		String outVal = val.substring(8, 14); //9,2 13,2 9,11 9,6 9,4
//		System.out.println(outVal);
		
//		BiPredicate<String, String> regexPattern = (actualValue, checkerValue) -> {
//		      for (int i = 0; i < checkerValue.length(); i++) {
//		        char value1 = checkerValue.charAt(i);
//		        char value2 = actualValue.charAt(i);
//		        if (value1 != '?' && value1 != value2 && value1 != '*') {
//		          return false;
//		        }
//		      }
//		      return true;
//		    };
//		    
//		    boolean test = regexPattern.test(val, "????????98*");
//		    System.out.println(test);
		
//		BiPredicate<String, String> regexPatternIn = (actualValue, checkerValue) -> {
//		      List<String> list = Arrays.asList(checkerValue.split(","));
//		      return list.stream().anyMatch(Pattern -> regexPattern().test(actualValue, Pattern));
//		    };
////		String checker = "????????????01*,????????????02*";
//		 String checker ="????????98*";   
//		
//		boolean test = regexPatternIn.test(val, null);
//		System.out.println(test);
		
//		String ruleExpression = "CR1 AND NOT(CR2 OR CR3) AND CR4";
//		
//		Map<String,String> map = new HashMap<>();
//		Boolean isValid = true;
//		map.put("CR1", Boolean.TRUE.toString());
//		map.put("CR2", Boolean.FALSE.toString());
//		map.put("CR3", isValid.toString());
//		map.put("CR4", Boolean.TRUE.toString());
//		String val = null;
//		for(Entry<String, String> criteria : map.entrySet()) {
//			ruleExpression = ruleExpression.replaceAll(criteria.getKey(), Boolean.TRUE.toString());
//		    }
//		
//		System.out.println(ruleExpression);
		
//		String input ="C530    000010 2401";
//		String checker ="1220";
//		int beginIndex = input.length() - checker.length();
		String input ="getSST";
		String substring = input.substring(3);
		System.out.println(substring);
		
		
	}
	
	
	private static BiPredicate<String, String> regexPattern() {
	    BiPredicate<String, String> regexPattern = (actualValue, checkerValue) -> {
	      for (int i = 0; i < checkerValue.length(); i++) {
	        char value1 = checkerValue.charAt(i);
	        char value2 = actualValue.charAt(i);
	        if (value1 != '?' && value1 != value2 && value1 != '*') {
	          return false;
	        }
	      }
	      return true;
	    };
	    return regexPattern;
	  }

	private static void getValue() {

		Boolean res = true;
		List<String> list =new ArrayList<>();
		list.add("code");
		list.add("model");
		list.add("level");
	}
}
