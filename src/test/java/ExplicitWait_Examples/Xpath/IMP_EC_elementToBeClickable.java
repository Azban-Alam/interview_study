package ExplicitWait_Examples.Xpath;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_elementToBeClickable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm"); // URL launch
		driver.findElement(By.className("mui-btn")).click();
		
		// explicit wait
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// elementToBeClickable expected criteria
		WebElement until = wt.until(ExpectedConditions.elementToBeClickable(By.className("s-buy")));
		
		driver.close();
	}
}



/*
 * An expectation for checking an element is visible and enabled such that you
 * can click it. Parameters:locator used to find the element Returns:the
 * WebElement once it is located and clickable (visible and enabled)
 * 
 */