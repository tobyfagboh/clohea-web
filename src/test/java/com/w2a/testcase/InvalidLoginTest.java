package com.w2a.testcase;


   import org.openqa.selenium.By;
   import org.testng.annotations.Test;

import com.w2a.base.TestBase;

    public class InvalidLoginTest extends TestBase  {
    	
    
		@Test
		
		public void InvalidLogin () throws InterruptedException {
			
			click("HomeloginBtn_XPATH");
			Thread.sleep(2000);
			driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("email_TEXT"));
			driver.findElement(By.name(OR.getProperty("password_NAME"))).sendKeys(OR.getProperty("password_TEXT"));		
			click("signupBtn_ID");
			Thread.sleep(3000);
}

    }