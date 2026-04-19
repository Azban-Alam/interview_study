package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_visibilityOfElementLocated {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input")));
		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}

}

/*
 * An expectation for checking that an element is present on the DOM of a page and visible.
 * Visibility means that the element is not only displayed but also has a height and width 
 * that is greater than 0.
 * Parameters:locator used to find the element
 * Returns:the WebElement once it is located and visible
 */