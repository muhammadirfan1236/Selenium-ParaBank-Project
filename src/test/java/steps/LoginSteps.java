package steps;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;

public class LoginSteps {

	WebDriver driver ;
	
	
	
	@Given("User navigate to the BookCart application login")
	public void userNavigateToTheBookCartApplicationLogin() {
		
		
		driver=new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
		Options manage=driver.manage();
		manage.timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		manage.window().maximize();
		System.out.println(driver.getTitle());
		   
	}


	
	@And("User clicks on the login button")
	public void userClicksOnTheLoginButton() {
		
		driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[2]")).click();
		   
	}
	
	
	@And("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	}
	@And("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}
	
	
	
	/*
	@And("User enter the username as irfan")
	public void userEnterTheUsernameAsIrfan() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("irfan");
	    
	}
	@And("User enter the password as Irfan123")
	public void userEnterThePasswordAsIrfan123() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Irfan123");
	   
	}
	
	@Given("User enter the username as koushik")
	public void userEnterTheUsernameAsKoushik() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("koushik");
	}
	@Given("User enter the password as passkoushik")
	public void userEnterThePasswordAsPasskoushik() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passkoushik");
		
	}
	
	*/
	
	
	
	@When("User click on the login button")
	public void userClickOnTheLoginButton() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	
	@When("Login shoild be success")
	public void loginShoildBeSuccess()  {
		
	    		String text=driver.findElement(By.xpath("(//mat-icon[text()='account_circle']/following-sibling::span)[3]")).getText();
	    		System.out.println("Hello  "+text);
		
	}
	
	
	
	
	
	@But("Login shoild fail")
	public void loginShoildFail() {
	    driver.quit();
	}

	
	
	
	
	
	
}
