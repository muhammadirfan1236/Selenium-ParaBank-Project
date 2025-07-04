package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Options;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println(">> Launching browser");
        
        driver=new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
		Options manage=driver.manage();
		manage.timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		manage.window().maximize();
		
		
    }

    @After
    public void tearDown() {
        System.out.println(">> Closing browser");
        if (driver != null) {
            driver.quit();
        }
    }
}