package com.acme.secretsanta.game.csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

import com.acme.secretsanta.game.model.Employee;

public class CSVWriter {

	public void writeToCsvFile(List<Employee> employeeList) {

		String filePath = getFilPath();

		if (Objects.nonNull(filePath)) {
			BufferedWriter writer;
			try {
				writer = new BufferedWriter(new FileWriter(filePath));

				writer.append("Employee_Name,Employee_EmailID,Secret_Child_Name,Secret_Child_EmailID\n");
				employeeList.stream().forEach(employee -> {
					try {
						writer.append(employee.getName()).append(",").append(employee.getEmail()).append(",")
								.append(employee.getSecretChild().getName()).append(",")
								.append(employee.getSecretChild().getEmail()).append("\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				});

				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	private String getFilPath() {
		JFrame frame = new JFrame();

		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView());
		fileChooser.setDialogTitle("Select a file to save CSV");
		fileChooser.setSelectedFile(new java.io.File("SecresantaAssignments.csv"));

		int result = fileChooser.showSaveDialog(frame);
		if (result == JFileChooser.APPROVE_OPTION) {
			String csvFile = fileChooser.getSelectedFile().getAbsolutePath();
			return csvFile;
		} else {
			System.out.println("file Path not selected");
			return null;
		}

	}

}
