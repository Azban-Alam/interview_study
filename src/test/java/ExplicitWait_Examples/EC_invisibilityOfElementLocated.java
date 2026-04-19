package ExplicitWait_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_invisibilityOfElementLocated {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// identify element and click()
		driver.findElement(By.xpath("//*[text()='Library']")).click();
		// explicit wait of invisibility condition
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		// invisibilityOfElementLocated condition
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='mui-btn']")));
		// get page title of next page
		System.out.println("Page title after click:" + driver.getTitle());
		driver.close();
	}
}

/*
 * How to wait until an element no longer exists in Selenium?
 * 
 * We can wait until an element no longer exists in Selenium webdriver. This can
 * be achieved with synchronization in Selenium. We shall add an explicit wait
 * criteria where we shall stop or wait till the element no longer exists.
 * Timeout exception is thrown once the explicit wait time has elapsed and the
 * expected behavior of the element is still not available on the page. To check
 * if an element no longer exists on the page, we can take the help of the
 * expected condition invisibilityOfElementLocated.
 * 
 * To implement explicit wait conditions, we have to take help of the
 * WebDriverWait and ExpectedCondition class.
 * 
 */