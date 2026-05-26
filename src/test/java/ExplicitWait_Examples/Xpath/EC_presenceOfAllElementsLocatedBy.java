package ExplicitWait_Examples.Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_presenceOfAllElementsLocatedBy {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			List<WebElement> p = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));

		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}
}


/* 
 * An expectation for checking that there is at least one element present on a
 * web page. Parameters:locator used to find the element Returns:the list of
 * WebElements once they are located
 */