package com.work.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	protected WebDriver driver;
	private String textForSignIn;
	
	public SignIn(WebDriver driver){
		this.driver=driver;
	}
	
	/*public String getTextForSignIn() {
		return textForSignIn;
	}


	public void setTextForSignIn(String textForSignIn) {
		this.textForSignIn = textForSignIn;
	}*/

	
	
	public SignInPageObject signIn() throws InterruptedException
	{
		//WebElement login = driver.findElement(By.id("login-email"));
		//login.sendKeys("dzaras777@yahoo.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement verifyEmail = driver.findElement(By.cssSelector("span[class='validate-icon asterisk']"));
		verifyEmail.click();
		WebElement signInButton = driver.findElement(By.className("signin-link"));
		signInButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement textVerify = driver.findElement(By.cssSelector("div[id='custom-content-left']"));
		//String str = textVerify.getText();
		//setTextForSignIn(str);
		return new SignInPageObject(driver);
	}
}
