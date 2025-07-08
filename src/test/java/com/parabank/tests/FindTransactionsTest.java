package com.parabank.tests;
import com.parabank.base.BaseTest;
import com.parabank.pages.FindTransactionsPage;
import com.parabank.pages.LoginPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FindTransactionsTest extends BaseTest {
	
	 @BeforeMethod
	    public void setUpTest(ITestResult result) {
	        // Add this line to make driver accessible to the listener
	        result.setAttribute("driver", driver);
	    }
	 
	@Test
	public void testFindTransactionsFeature() {
		
		  driver.get("https://parabank.parasoft.com/parabank/index.htm");
			
			LoginPage loginPage=new LoginPage(driver);
			loginPage.login("kurwa1", "irfanK@123321");
			
			
	        driver.get("https://parabank.parasoft.com/parabank/findtrans.htm");
	        FindTransactionsPage findPage = new FindTransactionsPage(driver);
	       

	       findPage.searchByDate("07-08-2025");
	       Assert.assertTrue(findPage.isResultDisplayed(), "No result for Date");


	        

		
		
	}

}
