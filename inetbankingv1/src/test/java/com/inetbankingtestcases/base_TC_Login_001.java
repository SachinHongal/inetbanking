
package com.inetbankingtestcases;

import org.testng.annotations.Test;

import com.inetbanking.POM.loginpage;

public class base_TC_Login_001 extends baseclass {
	@Test
	public void logintest() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(500);
		loginpage lp = new loginpage(driver);
		lp.setusername(username);
		Thread.sleep(500);
		lp.setpassword(pwd);
		Thread.sleep(500);
		lp.clicksubmit();

		if(driver.getTitle().equals("actiTIME_Login"))
		{

			System.out.println("title is displayed");
		}
		else
		{
			System.out.println("title is not displayed");
		}
	}
}

