package ExplicitWait_Examples.Elements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_textToBePresentInElementValue {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		WebElement element = driver.findElement(By.xpath("//input"));
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			boolean b = wait.until(ExpectedConditions.textToBePresentInElementValue(element, "text"));
		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}

}

/*
 * Checking if the given text is present in the specified elements value
 * attribute. Parameters: WebElement and "value attribute" text . Returns:true
 * once the element's value attribute contains the given text
 */