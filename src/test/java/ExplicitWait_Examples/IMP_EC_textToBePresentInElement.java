package ExplicitWait_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_textToBePresentInElement {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);

		WebElement element = driver.findElement(By.xpath("//input"));
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			boolean b = wait.until(ExpectedConditions.textToBePresentInElement(element, "element_text_value"));
		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}
}

/*
 * An expectation for checking if the given text is present in the specified
 * element. Parameters:element the WebElement ,text to be present in the
 * element Returns:true once the element contains the given text
 */

