package com.work.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountModule {

	WebDriver driver;
	
	public MyAccountModule(WebDriver driver){
		this.driver = driver;
	}

	
	public String verifyUserEmail()
	{	
		WebElement emailFromMyAccount =  
		driver.findElement(By.cssSelector("span[class='content ui-test-email']"));
		String email = emailFromMyAccount.getText();
		return email;
	}
	
	
	
	
}
