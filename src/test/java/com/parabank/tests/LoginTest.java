package com.parabank.tests;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.parabank.base.BaseTest;
import com.parabank.pages.LoginPage;




public class LoginTest extends BaseTest {
	
	 @Test
	public void testValidLogin() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("kurwa1", "irfanK@123321");
		
		
		
		
		

		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	String expectedUrl = "https://parabank.parasoft.com/parabank/overview.htm";
	Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed!");

    

	}
	 
	 
	

    @Test(enabled=false)
    public void testInvalidLogin() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid", "wrongpass");

        AssertJUnit.assertTrue(loginPage.getErrorMessage().contains("The username and password could not be verified."));
    }

}
