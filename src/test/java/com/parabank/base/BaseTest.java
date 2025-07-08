package com.parabank.base;


import com.parabank.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;


public class BaseTest {

	
	
	protected WebDriver driver;
	
	@BeforeMethod

	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url") + "/register.htm");

	}
	@AfterMethod
	public void tearDown() {
        driver.quit();
    }

}
