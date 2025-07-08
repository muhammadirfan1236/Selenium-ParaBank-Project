package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {

		this.driver=driver;
	}
	// Locators

	
	By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.cssSelector("input.button[value='Log In']");
    By errorMessage = By.cssSelector("p.error");
    
    public void enterUsername(String username) {
    	driver.findElement(usernameField).sendKeys(username);
    	
    }
    
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }



}
