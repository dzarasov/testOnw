package com.work.test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.DependencyMap;
import org.testng.annotations.*;

import com.work.main.CustomerSupportLink;
import com.work.main.ForgotPasswordPage;
import com.work.main.HomePage;
import com.work.main.SameAccountValidation;
import com.work.main.TestsPageBaseWithBeforeMethodAnnotation;
import com.work.main.SignIn;
import com.work.main.SignInPageObject;
import com.work.main.SignInProcedure;

import static org.testng.Assert.*;



	public class RegisterationWithRegisteredAccountTests extends TestsPageBaseWithBeforeMethodAnnotation{
		
		
	
		public void takeScreenshot() throws InterruptedException, IOException{
		int a = (int)(Math.random() * 20);
		int b = (int)(Math.random() * 17);
		int  sum=a*b;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(9000);
		FileUtils.copyFile(scrFile, new File("/Users/mikhaildzarasov/Desktop/scrshots/saloscreenshot"+sum+".png"));
	}
	

	
	
	/*@Test
	public void validateDevAccount() throws InterruptedException 
	{
		SameAccountValidation sameAccountValidation  = new SameAccountValidation(driver);
		assertTrue(sameAccountValidation.validateThatSameAccountCouldNotBeRegistreadTwice("dzaras777@yahoo.com"));
	}
	
	
	@Test
	public void testForgotPWD() throws InterruptedException, IOException
	{
		ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage(driver); 
		forgotpasswordpage.forgotPWDPage("dzazzzz@yahoo.com");
		assert(forgotpasswordpage.getText().contains("Wish to reset your password?"));
		//assert(getText().contains("nosorog"));
		if(!forgotpasswordpage.getText().contains("Wish to reset your password?")){
			takeScreenshot();
		}
	}
	
	@Test
	public void testSignIn() throws InterruptedException, IOException
	{
		SignIn s = new SignIn(driver);
		s.signIn();
		SignInPageObject signInPageObject = new SignInPageObject(driver);

		signInPageObject.checkingValueInSignInPage();
		System.out.println(signInPageObject.getTextForSignIn());
		if(!signInPageObject.getTextForSignIn().contains("New to Neustar?")){
					takeScreenshot();
				}
			assert(signInPageObject.getTextForSignIn().contains("New to Neustar?"));
			
	}
	
	
	
	@Test
	public void testContactSupport() throws InterruptedException, IOException{
		CustomerSupportLink cs = new CustomerSupportLink(driver);
		cs.alredyContactMember();
		//takeScreenshot();
		
	}
	
	

	*/
	

	
	
}
