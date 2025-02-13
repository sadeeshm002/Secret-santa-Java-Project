package com.acme.secretsanta.game.csv;

import java.util.Locale;
import java.util.ResourceBundle;

public class EmployeeInfoHelper {

	public static String getInfoFilePath(String fileName) {
		ResourceBundle bundleResource = ResourceBundle.getBundle("com.acme.secretsanta.game.csv.filepath",
				Locale.getDefault());
		String filePath = bundleResource.getString(fileName);
		return filePath == null ? "" : filePath;
	}

}
