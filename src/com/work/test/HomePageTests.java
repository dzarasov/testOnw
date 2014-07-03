package com.work.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.work.main.HomePage;
import com.work.main.SignInProcedure;
import com.work.main.TestsPageBaseWithBeforeClassAnnotation;
import com.work.main.TestsPageBaseWithBeforeMethodAnnotation;

public class HomePageTests extends TestsPageBaseWithBeforeClassAnnotation{

/*private String usN;
private String pwd;
	
	@Parameters({"userName","password"})
	@Test(priority=0)
		public void signInTest(String userName, String password)
			{	
				usN=userName;
				pwd= password;
				SignInProcedure signInProcedure = new SignInProcedure(driver);
				signInProcedure.signInWithEsxistinIPIAccount(usN, pwd);
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);		
			}
	
	
	@Test(dependsOnMethods={"signInTest"})
		public void homeButtonTest()
			{
				HomePage h = new HomePage(driver);
				h.clickOnHomeButton();
			}
	
	
	//@Test(dependsOnMethods={"homeButtonTest"})
	//	public void ipButtonTest()
	//		{
	//			HomePage h = new HomePage(driver);
	//			h.clickOnIpInformationButtonToRedirectToIPpage();
	//			//h.clickOnIpReputatainButtonToRedirectToIPpage();

			//}
			*/
}
