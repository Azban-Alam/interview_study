package ExplicitWait_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_numberOfElementsToBeMoreThan {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm"); // URL launch
		
		WebElement e1 = driver.findElement(By.className("mui-btn"));

		// explicit wait
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));

		// elementToBeClickable expected criteria
		wt.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("input"), 1));

		driver.close();
	}

}

/* 
 * An expectation for checking number of WebElements with given locator being
 * more than defined number Parameters:locator used to find the element number 
 * used to define minimum number of elements
 * Returns:Boolean true when size of elements list is more than defined
 * 
 */