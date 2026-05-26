package ExplicitWait_Examples.Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_presenceOfElementLocated {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement p = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input")));

		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}
}

/*
 * An expectation for checking that an element is present on the DOM of a page.
 * This does not necessarily mean that the element is visible.
 * Parameters:locator used to find the element Returns:the WebElement once it is
 * located
 */