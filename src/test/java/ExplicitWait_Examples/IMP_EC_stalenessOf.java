package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_stalenessOf {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm"); // URL launch
		WebElement e1 = driver.findElement(By.className("mui-btn"));

		// explicit wait
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));

		// elementToBeClickable expected criteria
		Boolean until = wt.until(ExpectedConditions.stalenessOf(e1));

		driver.close();
	}
}

/*
 * Wait until an element is no longer attached to the DOM.
 * Parameters:WebElement.Returns:false if the element is still attached to the
 * DOM, true otherwise.
 */