package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_invisibilityOf {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// identify element and click()
		WebElement e1 = driver.findElement(By.xpath("//*[text()='Library']"));
		
		// explicit wait of invisibility condition
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		// invisibilityOfElementLocated condition
		w.until(ExpectedConditions.invisibilityOf(e1));
		// get page title of next page
		System.out.println("Page title after click:" + driver.getTitle());
		driver.close();
	}
}


/* 
 * An expectation for checking the element to be invisible Parameters:element
 * used to check its invisibilityReturns:Boolean true when elements is not
 * visible anymore
 */