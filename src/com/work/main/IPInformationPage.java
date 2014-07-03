package com.work.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class IPInformationPage{

	WebDriver driver;
	public String ipInfo="2.2.2.2";
	
	public IPInformationPage(WebDriver driver)
		{
			this.driver=driver;
		}
	
	
	public void ipLookUpButtonClick()
		{	
			WebElement ipLookUpButton =  
			driver.findElement(By.id("iplookup-tab"));
			ipLookUpButton.click();
		}
	
	public void ipLookUpButtonIputField()
	{	
		WebElement ipLookUpButton =  
		driver.findElement(By.id("ip-address-input"));
		ipLookUpButton.sendKeys(ipInfo);
		WebElement ipLookUpButtonForSubmitting =  
		driver.findElement(By.id("submit-lookup-button"));
		ipLookUpButtonForSubmitting.click();
		
	}
	
	public boolean newtworkTable()
	{	
		WebElement netTable =  
		driver.findElement(By.id("network"));
		if(netTable.isDisplayed())
		return true;
						
		else
		return false;
		
	}
	
	public boolean geographicDataTabel()
	{	
		WebElement geoTable =  
		driver.findElement(By.id("location"));
		if(geoTable.isDisplayed())
		return true;
		
		else
		return false;
		
	}
	
	public MyAccountModule myAccountModuleClick()
	{	
		WebElement myAccountModuleButton =  
		driver.findElement(By.cssSelector("a[href='#myaccount']"));
		myAccountModuleButton.click();
		return new MyAccountModule(driver);
	}
	
	
	
	

	
	}
