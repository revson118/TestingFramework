package com.CTest;

import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageTest extends BaseClass {
  @Test(priority=1)
  public void verifyUrl() {
	  
	
	String actUrl=hm.getUrl();
	Assert.assertTrue(actUrl.contains("crm"));
	System.out.println("Test Passed");
  }
  @Test(priority=2)
  public void verifyStatus() {
	 String nextpage= hm.getStatus();
	  Assert.assertTrue(nextpage.contains("login"),"Test failed");
	  
	  
  }
}
