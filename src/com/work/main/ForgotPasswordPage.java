package com.work.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends PageBaseClass {

	private WebDriver driver;
	private String textForForgotPWD;
	
	
	
	public String getText() {
		return textForForgotPWD;
	}


	public void setText(String text) {
		this.textForForgotPWD = text;
	}
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void forgotPWDPage(String emaiForVaidation) throws InterruptedException
	
	{
		//WebElement login = driver.findElement(By.id("login-email"));
		//login.sendKeys(emaiForVaidation);
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		PageBaseClass.registeredEmailAddressSendKeys(driver);
		WebElement verifyEmail = driver.findElement(By.cssSelector("span[class='validate-icon asterisk']"));
		verifyEmail.click();
		WebElement userNameField = driver.findElement(By.cssSelector("a[class='forgot-pass-link']"));		
		userNameField.click();
		WebElement gettingText = driver.findElement(By.cssSelector("div[class='page-info']"));		
		String str = gettingText.getText();
		setText(str);
	}

	public void signInWithEsxistinIPIAccount(){
		//getUserNameField().sendKeys(userName);
		//getPasswordFiled().sendKeys(password);
		//getSignInButton().click();

		WebElement login = driver.findElement(By.id("login-email"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		login.sendKeys("dzaras777@yahoo.com");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//getSignInButton().sendKeys("kjhgfd");
		//return new HomePage(driver);
	}
	
}
