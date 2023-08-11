package stepDefinitions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import io.cucumber.java.en.*;

public class Search {
	WebDriver driver;
	@Given("test multiple scenario case1")
	public void testmultiplescenariouc1()
	{
		System.out.println("other scenario-1");
	}
	@Given("test multiple scenario case2")
	public void testmultiplescenariouc2()
	{
		System.out.println("other scenario-2");
	}
	@Given("user is in Search page")
	public void navigateSearchPage()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo");
	}
	@When("user enters {string} product")
	public void enterProduct(String product)
	{
		driver.findElement(By.name("search")).sendKeys(product);
	}
	@And("Click on Search button")
	public void clicksearch()
	{
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
	}
	@Then("Product {string} should be displayed")
	public void verifyProduct(String sproduct)
	{
		System.out.println("Done");
		assertTrue(driver.findElement(By.xpath("//a[contains(text(),'"+sproduct+"')]")).isDisplayed());
		System.out.println("Product Matched");
		
		//driver.quit();
	}
	
	
}
