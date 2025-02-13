package com.acme.secretsanta.game;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.acme.secretsanta.game.csv.CSVReader;
import com.acme.secretsanta.game.csv.CSVWriter;
import com.acme.secretsanta.game.csv.EmployeeInfoHelper;
import com.acme.secretsanta.game.model.Employee;

public class SecretSantaGame {

	public static void main(String[] args) {

		String employeeInfoFile = EmployeeInfoHelper.getInfoFilePath("com.acme.employee.info");
		String previousYearGameFile = EmployeeInfoHelper.getInfoFilePath("com.acme.previousyear.secretsanta.info");

		CSVReader csvReader = new CSVReader();
		List<Employee> employeeList = csvReader.readEmployeeInformation(employeeInfoFile);
		List<Employee> previousYearGameData = csvReader.readEmployeeInformation(previousYearGameFile);

		Map<String, String> employeeAndChildMap = previousYearGameData.stream()
				.collect(Collectors.toMap(Employee::getEmail, emp -> emp.getSecretChild().getEmail()));

		SecretSantaAssignment santaAssignment = new SecretSantaAssignment();
		santaAssignment.assignChild(employeeList, employeeAndChildMap);

		CSVWriter csvWriter = new CSVWriter();
		csvWriter.writeToCsvFile(employeeList);
	}

}
