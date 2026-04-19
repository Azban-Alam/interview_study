package ExplicitWait_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_attributeToBeNotEmpty {
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
		wt.until(ExpectedConditions.attributeToBeNotEmpty(e1, "background-color"));

		driver.close();
	}

}



/*
 * An expectation for checking WebElement any non empty value for given
 * attribute Parameters:element used to check its parameters attribute used to
 * define css or html attribute Returns:Boolean true when element has css or html
 * attribute with non empty value
 */