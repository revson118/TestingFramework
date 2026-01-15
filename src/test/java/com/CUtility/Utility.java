package com.CUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void getScreenShot(WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//ScreenShot//Test"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
