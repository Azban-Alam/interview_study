package ExplicitWait_Examples.Others;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class IMP_EC_numberOfWindowsToBe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/windows/"); // enter URL

		// Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		System.out.println("originial window name " + originalWindow);

		// Check we don't have other windows open already
		assert driver.getWindowHandles().size() == 1;

		// Click the link which opens in a new window
		WebElement myElement = driver.findElement(By.xpath("//p[2]/a"));

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).withMessage("This is my message");
		wait.until(ExpectedConditions.elementToBeClickable(myElement)).click();

		// Wait for the new window or tab
		Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		// Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Wait for the new tab to finish loading content
		wait.until(ExpectedConditions.titleIs("Selenium"));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

}
