package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_attributeToBe {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);

		WebElement element = driver.findElement(By.xpath("//input"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean until = wait.until(ExpectedConditions.attributeToBe(element, "attribute_name", "attribute_value"));

	}
}

/*
 * An expectation for checking given WebElement has attribute with a specific
 * value Parameters:element used to check its parameters attribute used to
 * define css or html attribute value used as expected attribute
 * valueReturns:Boolean true when element has css or html attribute with the
 * value
 * 
 */