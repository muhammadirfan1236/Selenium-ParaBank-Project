package com.parabank.tests;
import com.parabank.base.BaseTest;
import com.parabank.pages.AccountOverviewPage;
import com.parabank.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AccountOverviewTest extends BaseTest {
	
	@Test
	public void testAccountOverview() {
		
     driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("user3", "irfanK@123321");

	
	
    // Account overview page
    AccountOverviewPage overviewPage = new AccountOverviewPage(driver);

    Assert.assertTrue(overviewPage.isAtOverviewPage(), "Account Overview page not loaded.");
    Assert.assertTrue(overviewPage.tableViewExits(), "Welcome message not visible.");
    
    

    
    
   }


	

}
