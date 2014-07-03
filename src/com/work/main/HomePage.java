package com.work.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	

	public void clickOnHomeButton(){
	WebElement homeButton = driver.findElement(By.cssSelector("a[href='#home']"));
	homeButton.click();
	}

	
	public IPInformationPage clickOnIpInformationButtonToRedirectToIPpage(){
		WebElement ip = driver.findElement(By.cssSelector("a[href='#ip']"));
		ip.click();
		return new IPInformationPage(driver);
		}

	public void signOut(){
		WebElement homeButton = driver.findElement(By.cssSelector("a[href='#home']"));
		homeButton.click();
		//<a id="login-button"
	}
	
}
