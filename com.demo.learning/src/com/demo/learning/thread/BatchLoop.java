package com.demo.learning.thread;

import java.util.ArrayList;
import java.util.List;

public class BatchLoop {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		for (int i = 0; i < 142; i++) {
			Employee emp = new Employee(i, "Vijay", 23);
			employeeList.add(emp);
		}

		int total = employeeList.size();
		int batchSize = 200;

		for (int i = 0; i < total; i += batchSize) {
			List<Employee> batch = employeeList.subList(i, Math.min(i + batchSize, total));

			System.out.println(batch.size());
		}

	}

}
