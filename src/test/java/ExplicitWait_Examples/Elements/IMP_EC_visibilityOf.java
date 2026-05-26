package ExplicitWait_Examples.Elements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_visibilityOf {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);

		WebElement element = driver.findElement(By.xpath(""));

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement e1 = wait.until(ExpectedConditions.visibilityOf(element));

		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}

}

/*
 * Checking that an element, present on the DOM of a page, is visible.
 * Visibility means that the element is not only displayed but also has a height
 * and width that is greater than 0. Parameters: WebElement Returns: WebElement
 * once it is visible
 */
