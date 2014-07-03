package com.work.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBaseClass {

	WebDriver driver;
	
	public static void registeredEmailAddressSendKeys(WebDriver driver){
		WebElement login = driver.findElement(By.id("login-email"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//this email already registered in production IPI
		login.sendKeys("dzaras777@yahoo.com");
	}
	
	
	public static String getValueFromTestDataFile(String value) {
		Properties prop = new Properties();
		String selectedItem = null;

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"test_data.properties");
			prop.load(fileInputStream);
			selectedItem = prop.getProperty(value);
			fileInputStream.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return selectedItem;
	}
	
	
	
}
