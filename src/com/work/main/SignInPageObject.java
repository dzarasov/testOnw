package com.work.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObject {

	public WebDriver driver;
	private String textForSignIn;
	
	public SignInPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTextForSignIn() {
		return textForSignIn;
	}


	public void setTextForSignIn(String textForSignIn) {
		this.textForSignIn = textForSignIn;
	}

	
	public void checkingValueInSignInPage(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement textVerify = driver.findElement(By.cssSelector("div[id='custom-content-left']"));
		String str = textVerify.getText();
		setTextForSignIn(str);
	}

}
