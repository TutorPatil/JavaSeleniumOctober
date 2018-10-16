package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	@AfterSuite(alwaysRun=true)
	public static void closeBrowser()
	{
		driver.quit();
		
	}

}
