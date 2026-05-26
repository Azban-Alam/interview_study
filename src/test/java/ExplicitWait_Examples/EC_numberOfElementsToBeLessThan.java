package ExplicitWait_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_numberOfElementsToBeLessThan {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm"); // URL launch
		driver.findElement(By.className("mui-btn")).click();
		
		// explicit wait
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// elementToBeClickable expected criteria
		List<WebElement> until = wt.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("loginForm"), 1));
		
		driver.close();
	}

}


/*
 * 
 * An expectation for checking number of WebElements with given locator being
 * less than defined number Parameters:locator used to find the element number
 * used to define maximum number of elements Returns:Boolean true when size of
 * elements list is less than defined
 * 
 */
