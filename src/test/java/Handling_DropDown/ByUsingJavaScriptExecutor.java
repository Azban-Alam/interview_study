package Handling_DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingJavaScriptExecutor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bstackdemo.com/");

		// Click On Drop-Down
		WebElement dd = driver.findElement(By.xpath("//select"));

		// Use executeScript method to select the desired option.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='highestprice'", dd);

		// Another Code
		WebElement element = driver.findElement(By.xpath("//select")); // or your target element
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", element);
	}

}
