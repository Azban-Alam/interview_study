
package ExplicitWait_Examples.Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_textToBe {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean until = wait
				.until(ExpectedConditions.textToBe(By.xpath("//input[@id='value']"), " element_text_value"));

	}
}

/*
 * Checking WebElement with given locator has specific text .Parameters: locator
 * Returns: true when element has text value equal to @value
 */