package com.w2a.testcase;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class HomepageLaunch extends TestBase  {
	@Test
	public void homepagelaunch () throws InterruptedException {
	
	// Validation of homepage log in
		
		click("testsiteurl");
		Thread.sleep(2000);

}}
