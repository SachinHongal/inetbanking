package com.inetbanking.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	//initilization
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Declaration
	@FindBy(name="username")
	WebElement txtUsername;
	
	@FindBy(name="pwd")
	WebElement txtpwd;
	
	@FindBy(xpath="//div[.='Login ']")
	WebElement btnlogin;
	
	//utilization
	
	public void setusername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		btnlogin.click();
	}
	








}
