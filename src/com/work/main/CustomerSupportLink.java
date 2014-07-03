package com.work.main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerSupportLink extends PageBaseClass{

	private WebDriver driver;
	
	public CustomerSupportLink(WebDriver driver) {
		this.driver=driver;
		}

/*	public void registeredEmailAddressSendKeys(){
		WebElement login = driver.findElement(By.id("login-email"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		login.sendKeys("dzaras777@yahoo.com");
	}*/
	
	
public void alredyContactMember() throws InterruptedException, IOException{
		
		PageBaseClass.registeredEmailAddressSendKeys(driver);

		WebElement verifyEmail = driver.findElement(By.cssSelector("span[class='validate-icon asterisk']"));
		verifyEmail.click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement customersupportlink = driver.findElement(By.cssSelector("a[href='mailto:support-ipintel@neustar.biz']"));
		customersupportlink.click();

		
	}

}
