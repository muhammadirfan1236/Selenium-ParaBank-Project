package com.parabank.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import com.parabank.base.BaseTest;
import com.parabank.pages.RegisterPage;





public class RegisterTest extends BaseTest {
	
	

	@Test(priority = 1)
	public void testUserRegistration() {
	
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.fillForm("suck1", "Gulzar", "Test St", "Krakow", "Malopolskie",
                "30-001", "144456755", "999-99-9999",
                "wasim12", "irfanK@123321");
//System.currentTimeMillis()
      registerPage.submit();
      AssertJUnit.assertTrue(driver.getPageSource().contains("Your account was created successfully"));
      registerPage.logoutBtn();
      
     
      
	
	}
	
}
