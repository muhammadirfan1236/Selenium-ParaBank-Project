package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FindTransactionsPage {
	
	WebDriver driver;

    public FindTransactionsPage(WebDriver driver) {
        this.driver = driver;
    }

    
   
    private By transactionDateField = By.id("transactionDate");
  
    private By findButton = By.xpath(" (//button[@class='button'])[2]");
   
    private By resultTable = By.id("transactionTable");

    
  

    public void searchByDate(String date) {
        driver.findElement(transactionDateField).sendKeys(date);
        driver.findElement(findButton).click();
    }


    public boolean isResultDisplayed() {
        return driver.findElements(resultTable).size() > 0;
    }
    
    

}
