package ExplicitWait_Examples;

import java.time.Duration;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_textMatches {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);

		WebElement element = driver.findElement(By.xpath("//input"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textMatches(By.xpath("//input"), Pattern.compile("^[5-9]\\d%$")));
	}
}

/* 
 * An expectation for checking WebElement with given locator has text with a
 * value as a part of it Parameters:locator used to find the element pattern used
 * as expected text matcher patternReturns:Boolean true when element has text
 * value containing @value
 */