package com.work.test;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import com.work.main.IPInformationPage;
import com.work.main.MyAccountModule;
import com.work.main.TestsPageBaseWithBeforeClassAnnotation;

public class MyAccountModuleTests extends TestsPageBaseWithBeforeClassAnnotation {

	MyAccountModule myAccountModule;
	IPInformationPage informationPage;
	
	
	@Test
	public void validateEmailInMyAccountModule(){
		informationPage = new IPInformationPage(driver);
		informationPage.myAccountModuleClick();
		myAccountModule = new MyAccountModule(driver);
		
	//	assertEquals(myAccountModule.verifyUserEmail(), );
	}
	
}
