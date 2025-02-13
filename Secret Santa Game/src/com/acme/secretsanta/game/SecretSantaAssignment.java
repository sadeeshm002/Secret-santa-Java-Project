package com.acme.secretsanta.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.acme.secretsanta.game.model.Employee;

public class SecretSantaAssignment {

	public void assignChild(List<Employee> employeeList, Map<String, String> employeeAndChildMap) {

		if (!(isNullOrEmpty(employeeList) || isNullOrEmpty(employeeAndChildMap))) {
			List<Employee> childAssignmentList = new ArrayList<Employee>();
			childAssignmentList.addAll(employeeList);

			Collections.shuffle(childAssignmentList);

			for (Employee employee : employeeList) {
				for (Employee child : childAssignmentList) {
					String employeeId = employee.getEmail();
					String childId = child.getName();
					if (!(employeeId.equalsIgnoreCase(childId)
							|| employeeAndChildMap.get(employeeId).equalsIgnoreCase(childId))) {
						employee.setSecretChild(child);
						childAssignmentList.remove(child);
						break;
					}
				}
			}
		} else {
			System.out.println("Please provide Proper Employee Information");
		}
	}

	private boolean isNullOrEmpty(Collection<?> collection) {
		return Objects.isNull(collection) || collection.isEmpty();
	}

	private boolean isNullOrEmpty(Map<?, ?> map) {
		return Objects.isNull(map) || map.isEmpty();
	}

}
