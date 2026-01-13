package com.CTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.CRM.HomePage;
import com.CRM.Login;

public class BaseClass {
	
public WebDriver driver;
public HomePage hm;
public Login lp;


@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://automationplayground.com/crm/");
	
	hm= new HomePage(driver);
	lp=new Login(driver);
}
}
