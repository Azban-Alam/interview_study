package ExplicitWait_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_invisibilityOfElementWithText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		// invisibilityOfElementLocated condition
		w.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(""), "text"));
		// get page title of next page
		System.out.println("Page title after click:" + driver.getTitle());
		driver.close();
	}
}



/*
 * An expectation for checking that an element with text is either invisible or
 * not present on the DOM. Parameters:locator used to find the element text of the
 * element Returns:true if no such element, stale element or displayed text not
 * equal that provided
 */