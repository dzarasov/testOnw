package com.work.test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.work.main.HomePage;
import com.work.main.IPInformationPage;
import com.work.main.SignInProcedure;
import com.work.main.TestsPageBaseWithBeforeClassAnnotation;

public class IPInformationPageTests extends TestsPageBaseWithBeforeClassAnnotation
	{
		//IPInformationPageTests iPInformationPageTests = new IPInformationPageTests();
	
	private String usN;
	private String pwd;
	IPInformationPage iPInformationPageTests;
		
		
	
	
		@Parameters({"userName","password"})
		@Test(priority=0)
		public void signInTest(String userName, String password){	
		usN=userName;
		pwd= password;
		SignInProcedure signInProcedure = new SignInProcedure(driver);
		signInProcedure.signInWithEsxistinIPIAccount(usN, pwd);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);		
}
		
		@Test(dependsOnMethods={"signInTest"}, priority=1)
		public void ipButtonTest(){
		HomePage h = new HomePage(driver);
		h.clickOnIpInformationButtonToRedirectToIPpage();
}
		
		@Test(dependsOnMethods={"ipButtonTest"}, priority=2)
		public void sendTextToIpLookupFiled(){
		//IPInformationPage iPInformationPageTests = new IPInformationPage(driver);
		iPInformationPageTests = new IPInformationPage(driver);
		iPInformationPageTests.ipLookUpButtonIputField();
}
	
		@Test(dependsOnMethods={"sendTextToIpLookupFiled"}, priority=3)
		public void clickOnIPLookUPB(){
		iPInformationPageTests = new IPInformationPage(driver);
		iPInformationPageTests.ipLookUpButtonClick();
}
		
		@Test(dependsOnMethods={"clickOnIPLookUPB"}, priority=4)
		public void makeSureNetorkTablePresented(){
		iPInformationPageTests = new IPInformationPage(driver);
		assertTrue(iPInformationPageTests.newtworkTable());
}
		@Test(dependsOnMethods={"clickOnIPLookUPB"},priority=5)
		public void makeSuregeographicDataTabelPresented(){
		iPInformationPageTests = new IPInformationPage(driver);
		assertTrue(iPInformationPageTests.geographicDataTabel());
		
}		
		
		
		
		
		
	}
