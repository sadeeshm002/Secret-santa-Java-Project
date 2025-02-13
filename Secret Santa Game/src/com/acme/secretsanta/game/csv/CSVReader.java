package com.acme.secretsanta.game.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.acme.secretsanta.game.model.Employee;

public class CSVReader {

	public List<Employee> readEmployeeInformation(String employeeInfo) {

		if (Objects.nonNull(employeeInfo) && !employeeInfo.isEmpty()) {
			BufferedReader br = null;

			List<Employee> employeeList = new ArrayList<Employee>();

			try {
				br = new BufferedReader(new FileReader(employeeInfo));

				String line;

				// Removing Header
				br.readLine();

				while ((line = br.readLine()) != null) {
					String[] values = line.split(",");
					if (values.length == 2) {
						Employee employee = new Employee(values[0], values[1]);
						employeeList.add(employee);
					} else if (values.length == 4) {
						Employee employee = new Employee(values[0], values[1]);
						employee.setSecretChild(new Employee(values[2], values[3]));
						employeeList.add(employee);
					}
				}

				return employeeList;

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null) {
						br.close();
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

		} else {
			System.out.println("Employee Information Not found Please check input file");
			return null;
		}
		return null;

	}

}
