package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_refresh {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm"); // URL launch
		WebElement e1 = driver.findElement(By.className("mui-btn"));

		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(e1)));
		 
		driver.close();
		
	}
}


/*
 * 
 * Wrapper for a condition, which allows for elements to update by redrawing.
 * 
 * This works around the problem of conditions which have two parts: find an
 * element and then check for some condition on it. For these conditions it is
 * possible that an element is located and then subsequently it is redrawn on the
 * client. When this happens a StaleElementReferenceException is thrown when the
 * second part of the condition is checked. Type Parameters:<T> return type of
 * the condition provided Parameters:condition ExpectedCondition to
 * wrapReturns:the result of the provided condition
 */