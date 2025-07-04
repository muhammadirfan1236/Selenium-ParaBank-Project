package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class AddToCartStep {

	WebDriver driver =Hooks.driver;
	
	
	
	
	
	
	@Given("User navigate to the BookCart application")
	public void userNavigateToTheBookCartApplication() {
		
		//driver=new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
//		Options manage=driver.manage();
//		manage.timeouts().implicitlyWait(Duration.ofSeconds(1));
//		
//		manage.window().maximize();
     	System.out.println(driver.getTitle());
		
		
	}
	
	
	
	@And("user login into the application with {string} and {string}")
	public void userLoginIntoTheApplicationWithAnd(String username , String password) {
		
		
		

		
	
		driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[2]")).click();
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		usernameField.sendKeys(username);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();

	   
	}
	@And("user search for a  {string}")
	public void userSearchForA(String book) {
		
		
		
		
		WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search books or authors']"));
		search.sendKeys(book);

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//mat-option//span[contains(text(), 'Roomies')]")));

		suggestion.click();


	}
	
	
	@When("user add the book to the cart")
	public void userAddTheBookToTheCart() {
	   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@class,'mdc-button mdc-button--raised')]//span)[2]")));
		usernameField.click();
		
		
		//driver.findElement(By.xpath("(//button[contains(@class,'mdc-button mdc-button--raised')]//span)[2]")).click();
		
	}
	
	
	@Then("the cart badge should get updated")
	public void theCartBadgeShouldGetUpdated() {
		
		

	System.out.print("Some Implementation Goes Here About Cart Updated  ");
	

	   
	}
	

	
	
}
