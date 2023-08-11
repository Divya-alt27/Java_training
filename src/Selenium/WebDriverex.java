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

public class WebDriverex {
	public static WebDriver driver;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
      //  driver.get("http://www.google.com");
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      //  System.out.println("Title is "+ driver.getTitle());
       // driver.close();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("IBM training");
       // Select newsletter
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        driver.findElement(By.xpath("//input[@id='radio2']")).click();
        driver.findElement(By.xpath("//button[@id='but2']")).click();

     
        driver.findElement(By.xpath("//input[@id='alert1']")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println("alert text is"+alert.getText());
        alert.accept();

        Actions act=new Actions(driver);
        act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double click Here')]"))).perform();
        Alert alert2=driver.switchTo().alert();
        System.out.println("New alert text is"+alert2.getText());
        alert2.accept();
        
        act.moveToElement(driver.findElement(By.xpath("//span[@id='blogsmenu']"))).perform();
       // driver.findElement(By.xpath("//a[@href='http://www.selenium143.blogspot.com']")).click();
        
        List<WebElement> we=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("no of rows is "+we.size());
      

      driver.close();
	}

}