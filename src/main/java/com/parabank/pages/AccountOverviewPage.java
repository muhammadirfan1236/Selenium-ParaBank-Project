package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class AccountOverviewPage {
	
	WebDriver driver;

    public AccountOverviewPage(WebDriver driver) {
        this.driver = driver;
    }
    
  
   
    
    private By pageTitle = By.cssSelector("h1.title");
    private By tableview=By.cssSelector("table#accountTable>thead>tr>th");

    public boolean isAtOverviewPage() {
        return driver.findElement(pageTitle).getText().contains("Accounts Overview");
        
    }
    
    public boolean tableViewExits() {
    	
    	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    	
    	try {
    		
    	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(tableview));
    	return element.isDisplayed();
    		
    	}   catch( Exception e) {
    		return false;

    	}

    }
    
    
    
   

   
    
    

    

}
