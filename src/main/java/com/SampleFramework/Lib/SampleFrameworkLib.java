package com.SampleFramework.Lib;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SampleFrameworkLib {
	// Write the core automation scripts for different steps in different method
	WebDriver driver;
	String expTitle = "ParaBank | Register for Free Online Account Access";
	Properties p1;
	FileReader f1;
	/*
	 * Properties p1,p2; FileReader f1,f2;
	 * 
	 * f1=new FileReader("./SampleFramework_OR/locators.properties"); f2=new
	 * FileReader("./SampleFramework_Testdata/testdata.properties");
	 */

	public void init2(WebDriver driver) {
		this.driver = driver;

	}

	/*
	 * public void BrowserMaximize() { driver.manage().window().maximize(); }
	 */

	public void App_Launch(WebDriver driver) throws IOException {
		// invoke application

		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		String Title = driver.getTitle();
		// System.out.println(Title);
		if (expTitle.equals(Title)) {
			System.out.println("Application is launched successfully");
		}

	}

	// Enter first name
	public void input_firstName(WebDriver driver) throws IOException {
		p1 = new Properties();
		Properties p2 = new Properties();

		f1 = new FileReader("./SampleFramework_OR/locators.properties");
		p1.load(f1);

		FileReader f2 = new FileReader("./SampleFramework_Testdata/testdata.properties");

		p2.load(f2);
		// check the element is present
		if (driver.findElement(By.xpath(p1.getProperty("Lfirstname"))).isDisplayed()) {
			driver.findElement(By.xpath(p1.getProperty("Lfirstname"))).sendKeys(p2.getProperty("Tdfirstname"));
		} else {
			System.out.println("Element firstname is not present");
		}
	}

	// Click on Register

	public void Click_On_Register(WebDriver driver) throws IOException {
		p1 = new Properties();
		f1 = new FileReader("./SampleFramework_OR/locators.properties");

		p1.load(f1);

		if (driver.findElement(By.xpath(p1.getProperty("RegisterButton"))).isDisplayed()) {
			driver.findElement(By.xpath(p1.getProperty("RegisterButton"))).click();
		} else {
			System.out.println("Element is invalid");
		}

	}

	// Capture Screen Image
	public void Capture_Screen(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("./ScreenCaptures/regsfunction.png"));

	}

	// Capture the message for validation
	public void Validation_Message1(WebDriver driver) {
		if (driver.findElement(By.xpath(p1.getProperty("message1"))).isDisplayed()) {
			String messagetest1 = driver.findElement(By.xpath(p1.getProperty("message1"))).getText();
			// validation for message
			System.out.println("Validation message is: " + messagetest1);
		}

	}
	/*
	 * public void wait_time() throws InterruptedException { Thread.sleep(3000); }
	 * 
	 * public void close_browser() { driver.quit(); }
	 */

}
