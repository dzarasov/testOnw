package com.work.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInProcedure {
	WebDriver driver;
	
	public SignInProcedure(WebDriver driver){
		this.driver=driver;
	}
	

	
	public void signInWithEsxistinIPIAccount(String userName, String password){
		
		WebElement el = driver.findElement(By.id("existing-member-reglink"));
		el.click();
		
		
		
		WebElement userNameFiled = driver.findElement(By.id("usernameOrEmail"));
		userNameFiled.sendKeys(userName);
		
		
		WebElement pwdFiled = driver.findElement(By.id("password"));
		pwdFiled.sendKeys(password);
		
		WebElement signInButton = driver.findElement(By.id("submit-button"));
		signInButton.click();

		
		//getUserNameField().sendKeys(userName);
		//getPasswordFiled().sendKeys(password);
		//getSignInButton().click();
		//driver.
		//clickOnAlreadyAMemberButton();
		//WebElement login = driver.findElement(By.id("login-email"));
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//login.sendKeys("dzaras777@yahoo.com");
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//getSignInButton().sendKeys("kjhgfd");
		//return new HomePage(driver);
	}
	
}


