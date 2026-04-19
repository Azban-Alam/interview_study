package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snippet {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 1. Wait for an Alert to be Present
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		// 2. Wait for an Element's Selection State
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementSelectionStateToBe(checkbox, true));

		// 3. Wait for an Element to be Clickable
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait3.until(ExpectedConditions.elementToBeClickable(By.id("submitButton")));
		button.click();

		// 4. Wait for an Element to be Selected
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.elementToBeSelected(dropdown));

		// 5. Wait for a Frame to be Available and Switch to It
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait5.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameName"));

		// 6. Wait for an Element to be Invisible
		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait6.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner")));

		// 7. Wait for an Element with Specific Text to be Invisible
		WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait7.until(ExpectedConditions.invisibilityOfElementWithText(By.id("status"), "Processing"));

		// 8. Wait for All Elements Located by a Locator to be Present
		WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait8.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("items")));

		// 9. Wait for an Element to be Present in the DOM
		WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait9.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		// 10. Wait for Text to be Present in an Element
		WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait10.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("message")), "Success"));

		// 11. Wait for Text to be Present in an Element Located by a Locator
		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait11.until(ExpectedConditions.textToBePresentInElementLocated(By.id("status"), "Completed"));

		// 12. Wait for Text to be Present in an Element's Value
		WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait12.until(ExpectedConditions.textToBePresentInElementValue(By.id("inputField"), "Hello"));

		// 13. Wait for a Page Title to Match Exactly
		WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait13.until(ExpectedConditions.titleIs("Dashboard"));

		// 14. Wait for a Page Title to Contain a Specific Word
		WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait14.until(ExpectedConditions.titleContains("Login"));

		// 15. Wait for an Element to be Visible
		WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait15.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("welcomeMessage"))));

		// 16. Wait for All Elements to be Visible
		WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait16.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.className("product"))));

		// 17. Wait for All Elements Located by a Locator to be Visible
		WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait17.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("items")));

		// 18. Wait for an Element Located by a Locator to be Visible
		WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait18.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation")));
		
		WebDriverWait wait19 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait19.until(ExpectedConditions.attributeContains(By.className("items"), "ID", "CLICK_ME"));
		
		WebElement button20 = wait3.until(ExpectedConditions.elementToBeClickable(By.id("submitButton")));
		WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait20.until(ExpectedConditions.domPropertyToBe(button20, "ID", "Click_Me"));
				
		WebDriverWait wait21 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait20.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(""), 2));
		
		
	}
}
