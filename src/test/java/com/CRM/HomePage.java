package com.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CUtility.Utility;

public class HomePage {
	
	//encapsulation=private data+public method
	//initialize driver
	//data member(locator)
	
//method(functionality to test)
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
   private By link=By.linkText("Sign In");
   
   public String getUrl() {
	   return driver.getCurrentUrl();
	   
   }
   public String getStatus() {
	   
	   Utility.getScreenShot(driver);
	   driver.findElement(link).click();
	   Utility.getScreenShot(driver);
	   return driver.getCurrentUrl();
   }
   
}
