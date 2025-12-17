package com.demo.learning.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListSortExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 8));
		
		list.add(10);
		
		Comparator<Employee> comp = Comparator.comparing(Employee::getName,Comparator.nullsFirst(Comparator.naturalOrder()));
		Comparator.comparing(Employee::getName);

		List<Employee> employeeList = new ArrayList<Employee>();
		Employee emp = new Employee(101, "Vijay", 23);
		employeeList.add(emp);
		employeeList.add(new Employee(105, "Jai", 21));
		employeeList.add(new Employee(107, "Abi", 27));
		employeeList.add(new Employee(106, "Ajay", 27));
		employeeList.add(new Employee(105, "Jai", 21));
//		employeeList.add(new Employee(null, null, null));
//		employeeList.add(new Employee(null, null, null));
		
		Map<Integer, Employee> idToEmp = employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
		
		Map<Integer, String> collect = employeeList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		for(Entry<Integer, String> ent:collect.entrySet()) {
			
		}
		
		for(Employee em:employeeList) {
			
		}
		
		
//		Set<Employee> employeeSet= new TreeSet<Employee>(comp);
//		employeeSet.add(new Employee(101, "Vijay", 23));
//		employeeSet.add(new Employee(106, "Ajay", 27));
//		employeeSet.add(new Employee(105, "Jai", 21));
//		employeeSet.add(new Employee(105, "Jai", 21));
////		employeeSet.add(null);
		
//		List<String> filterList = employeeList.stream().filter(e->e.getName().startsWith("A")).map(e ->e.getName()) .sorted().collect(Collectors.toList());

//		Collections.sort(employeeList,comp);
//		
//		employeeList.forEach(e->System.out.println(e));
//		
//		System.out.println("Set");
//		
//		employeeSet.forEach(e->System.out.println(e));
//		
//		Map<String, Employee> map = new HashMap<String, Employee>();
		
		List<String> stringList = new ArrayList<String>(Arrays.asList("sadeesh","ram","arun"));
		
		Collections.sort(stringList,Collections.reverseOrder());
		
		Optional<String> filter = stringList.stream().filter(e->e.startsWith("ma")).findAny();
		
		if(filter.isPresent()) {
			System.out.println(filter);  //orElseThrow
		}
		
		
		

	}

}
