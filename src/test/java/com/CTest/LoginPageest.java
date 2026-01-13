package com.CTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class LoginPageest extends BaseClass {
	
	@BeforeClass
	public void pageStup() {
		hm.getStatus();
	}
  @Test
  public void f() {
	  String url=lp.doLogin("tes@gmai.com", "test123");
	  Assert.assertTrue(url.contains("customers"),"Login failed");
	  
  }
}
