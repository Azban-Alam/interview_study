package ExplicitWait_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_visibilityOfAllElementsLocatedBy {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			List<WebElement> e1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input")));
		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}

}

/*
 * 
 * An expectation for checking that all elements present on the web page that
 * match the locator are visible. Visibility means that the elements are not only
 * displayed but also have a height and width that is greater than 0.
 * Parameters:locator used to find the element Returns:the list of WebElements
 * once they are located
 */