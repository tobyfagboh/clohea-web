package com.w2a.testcase;

 import org.openqa.selenium.By;
	   import org.testng.annotations.Test;

	import com.w2a.base.TestBase;

	public class ResetPasswordTest  extends TestBase  {
	    	
	    
			@Test
			
			public void ResetPassword () throws InterruptedException {
				
				click("HomeloginBtn_XPATH");
				Thread.sleep(2000);
				click("forgotpasswordBtn_XPATH");
				driver.findElement(By.xpath(OR.getProperty("resetpasswordemail_XPATH"))).sendKeys(OR.getProperty("email_TEXT"));
				click("retrieveSignUpBtn_XPATH");
				
	}
}
