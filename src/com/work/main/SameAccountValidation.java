package com.work.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SameAccountValidation extends PageBaseClass {

	WebDriver driver;
	
	public SameAccountValidation(WebDriver driver) {
		this.driver=driver;
	}

	public boolean validateThatSameAccountCouldNotBeRegistreadTwice(String email)throws InterruptedException
	{
		
		PageBaseClass.registeredEmailAddressSendKeys(driver);
		//WebElement login = driver.findElement(By.id("login-email"));
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//login.sendKeys(email);
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement verifyEmail = driver.findElement(By.cssSelector("span[class='validate-icon asterisk']"));
		verifyEmail.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signInButton = driver.findElement(By.cssSelector("div[class='validated-existing-user']"));
		String str = signInButton.getText();
		
		if(str.contains("Email Already in Use."))
			{
				return true;
			}
		else 
			{
				return false;
			}
	}
}
