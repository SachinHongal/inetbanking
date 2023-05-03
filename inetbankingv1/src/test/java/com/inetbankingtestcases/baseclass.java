package com.inetbankingtestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	
	public String baseURL="http://localhost/login.do";
	public String username="admin";
	public String pwd ="manager";
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir", baseURL)+"//Softwares//chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
