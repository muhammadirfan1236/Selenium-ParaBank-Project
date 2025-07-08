package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class RegisterPage {
	
	WebDriver driver;

    @FindBy(id = "customer.firstName") private WebElement firstName;
    @FindBy(id = "customer.lastName") private WebElement lastName;
    @FindBy(id = "customer.address.street") private WebElement address;
    @FindBy(id = "customer.address.city") private WebElement city;
    @FindBy(id = "customer.address.state") private WebElement state;
    @FindBy(id = "customer.address.zipCode") private WebElement zipCode;
    @FindBy(id = "customer.phoneNumber") private WebElement phone;
    @FindBy(id = "customer.ssn") private WebElement ssn;
    @FindBy(id = "customer.username") private WebElement username;
    @FindBy(id = "customer.password") private WebElement password;
    @FindBy(id = "repeatedPassword") private WebElement confirmPassword;
    @FindBy(css = "input[value='Register']") private WebElement registerBtn;
    @FindBy(xpath=("//a[normalize-space(text())='Log Out']")) private WebElement logoutbtn;
    
    
    
    
  

    
    
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void fillForm(String fn, String ln, String addr, String cityVal, String stateVal,
            String zip, String phoneVal, String ssnVal, String user, String pass) {
				firstName.sendKeys(fn);
				lastName.sendKeys(ln);
				address.sendKeys(addr);
				city.sendKeys(cityVal);
				state.sendKeys(stateVal);
				zipCode.sendKeys(zip);
				phone.sendKeys(phoneVal);
				ssn.sendKeys(ssnVal);
				username.sendKeys(user);
				password.sendKeys(pass);
				confirmPassword.sendKeys(pass);
}

public void submit() {
registerBtn.click();
}

public void logoutBtn() {
	logoutbtn.click();
}

    

}
