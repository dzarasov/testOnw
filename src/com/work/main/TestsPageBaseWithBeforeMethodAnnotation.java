package com.work.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestsPageBaseWithBeforeMethodAnnotation {
	
   protected WebDriver driver;
	
	@BeforeMethod()
    @Parameters("browser")
	public void beforeMethod(String browser){
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/mikhaildzarasov/Desktop/scrshots/chromedriver");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FF"))
		{
			driver= new FirefoxDriver();
		}
		driver.get("https://ipintelligence.neustar.biz/apps/registration/?CL=gp.od.dev.nsr");
		driver.manage().window().maximize();	
	}
   

	@AfterMethod
	public void closing(){
		//driver.close();
		//driver.quit();
		
	}

}
