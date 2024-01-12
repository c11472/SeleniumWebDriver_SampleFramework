package com.SampleFramework.scripts;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maintest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		Properties p = new Properties();

		FileReader browserinfo1 = new FileReader("./SampleFramework_Testdata/browserinfo.properties");

		p.load(browserinfo1);
		int case_index;
		Scanner c = new Scanner(System.in);
		case_index = c.nextInt();

		System.out.println("Enter the browser where you need to execute the code");

		switch (case_index) {
		case 1:
			if (p.getProperty("browser1").equals("firefox")) {
				driver = new FirefoxDriver();
				driver.get("https://www.google.com/");
				// method lib
				// call the method
			}
			break;

		case 2:
			if (p.getProperty("browser2").equals("chrome")) {
				driver = new FirefoxDriver();
				driver.get("https://www.google.com/");
				// call method from lib
			}
			break;

		default:
			System.out.println("Invalid case index");
		}

	}
}