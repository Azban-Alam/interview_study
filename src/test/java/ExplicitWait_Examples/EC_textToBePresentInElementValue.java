package ExplicitWait_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_textToBePresentInElementValue {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		WebElement e1 = driver.findElement(By.xpath("//input"));
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			boolean b = wait.until(ExpectedConditions.textToBePresentInElementValue(e1, "text"));
		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}

}



/*
 * An expectation for checking if the given text is present in the specified
 * elements value attribute. Parameters:element the WebElementvtext to be present
 * in the element's value attribute Returns:true once the element's value
 * attribute contains the given text
 */