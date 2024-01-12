package com.SampleFramework.scripts;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SampleFramework.Lib.SampleFrameworkLib;
import com.SampleFramework.Utilities.CommonMethods;

public class SampleFrameworkScript {
	static WebDriver driver = new ChromeDriver(); // once
	static SampleFrameworkLib obj;
	static CommonMethods obj1;
	Properties p, p2;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// test loctor

		obj = new SampleFrameworkLib();
		obj1 = new CommonMethods();
		obj1.init1(driver);
		obj1.BrowserMaximize(driver);
		obj.init2(driver);
		obj.App_Launch(driver);
		obj.input_firstName(driver);

		obj.Click_On_Register(driver);

		obj.Validation_Message1(driver);

		obj1.init1(driver);
		obj1.wait_time(driver);
		obj.init2(driver);

		obj.Capture_Screen(driver);

		obj1.init1(driver);
		obj1.wait_time(driver);

		obj1.close_browser(driver);

	}

}
