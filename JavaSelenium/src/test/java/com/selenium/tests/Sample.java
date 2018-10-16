package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.selenium.base.BaseClass;

public class Sample extends BaseClass{
	
	@Test
	public static void loginTest()
	{
		System.setProperty("webdriver.gecko.driver","./utilities/geckodriver.exe");
		driver = new FirefoxDriver();
		
		System.out.println("launching the browser");
		
		
		
		driver.get("http://google.com");
		
		System.out.println("Browser launched successfully");
		
		System.out.println("Change from Git repo");
		
		
	}

}
