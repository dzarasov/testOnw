package com.work.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestsPageBaseWithBeforeClassAnnotation {
	
	protected WebDriver driver;
	
	@BeforeClass
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
   

}
