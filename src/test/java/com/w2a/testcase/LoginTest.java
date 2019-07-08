package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void invalidLogin () throws InterruptedException {
		
		// Lauching homepage
				click("HomeloginBtn_XPATH");
				Thread.sleep(2000);
				// enter email address
				driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("email_TEXT"));
				// enter password
				driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("password_TEXT"));	
				// verify that sign in button works
				click("loginBtn_XPATH");
				
			// sign out 
				click("logoutdropdown_XPATH");
				Thread.sleep(2000);
				click("logoutbtn_XPATH");
				Thread.sleep(9000);
				
				// Verify that sign up button works
				click("Homesignupbtn_XPATH");
				
				Assert.assertTrue(isElementPresent(By.className(OR.getProperty("alert_CLASSNAME"))), "Your Credential is not Correct");
				log.debug("Log in successfully executed");  
				
	}}
				