package com.SampleFramework.Utilities;

import org.openqa.selenium.WebDriver;

public class CommonMethods {
	WebDriver driver;

	public void init1(WebDriver driver) {
		this.driver = driver;

	}

	public void BrowserMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void wait_time(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
	}

	public void close_browser(WebDriver driver) {
		driver.quit();
	}

}
