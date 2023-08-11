package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WebDriverex1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
        driver.findElement(By.xpath("//div[@id='search']//button")).click();
        if(driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).isDisplayed())
        {
        	System.out.println("Product search passed");
        }
        else
        {
        	System.out.println("Product search failed");
        }
        driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
        String price= driver.findElement(By.xpath("//h1[contains(text(),'iPhone')]/parent::div/ul[2]//h2")).getText();
        driver.findElement(By.xpath("//input[@name='quantity']")).clear();
        driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("2");
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
        driver.findElement(By.xpath("//div[@id='cart']/button")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]/parent::a")).click();
        String product=driver.findElement(By.xpath("//div[@id='content']/form//tbody/tr/td[2]/a")).getText();
        System.out.println("Product is "+product);
        String quantity=driver.findElement(By.xpath("//div[@id='content']/form//tbody/tr/td[4]//input")).getAttribute("value");
        System.out.println("Quantity is "+quantity);
        String unitprice=driver.findElement(By.xpath("//div[@id='content']/form//tbody/tr/td[5]")).getText();
        String totalprice=driver.findElement(By.xpath("//div[@id='content']/form//tbody/tr/td[6]")).getText();
        System.out.println("Unit price is "+unitprice);
       
        System.out.println("Total price is "+totalprice);
        driver.quit();
        
	}

}
