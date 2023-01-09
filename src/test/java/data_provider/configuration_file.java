package data_provider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.reporters.jq.Main;

public class configuration_file {

	static Properties p = new Properties();
	
	static {
		// String driverpath =
		// "D://TestAutomation//com.CUCUMBER_TEST02//src//main//resources//TestData.properties";
		String driverpath = "src/main/resources/TestData.properties";

		BufferedReader buf = null;
		p = new Properties();
		try {
			buf = new BufferedReader(new FileReader(driverpath));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			p.load(buf);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getDriverPath() {
		return p.getProperty("DriverPath");
	}

}
