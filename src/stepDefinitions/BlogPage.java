package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
public class BlogPage{
    WebDriver driver;
	
	@Given("user is in Blog page")
	public void navigateSearchPage()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
	}
	@When("user enters data in search field")
	public void enterProduct()
	{
		System.out.println("Entering validation");
		driver.findElement(By.name("q")).sendKeys("hello");
		System.out.println("Exiting validation");
	}
	@Then("data should appear in search field")
	public void VerifyProduct()
	{
		
		assertEquals("hello",driver.findElement(By.name("q")).getAttribute("value"));
		driver.quit();
	}
	}
	

