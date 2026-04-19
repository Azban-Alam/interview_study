package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	        driver.findElement(By.id("reveal")).click();
	 
	        WebElement revealTextBox = driver.findElement(By.id("revealed"));
	        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	        wait.until(d -> revealTextBox.isDisplayed());
	 
	        revealTextBox.sendKeys("Happy");
	        System.out.println("Input Text :" + revealTextBox.getDomProperty("value"));
	 
	        driver.quit();
	}

}
