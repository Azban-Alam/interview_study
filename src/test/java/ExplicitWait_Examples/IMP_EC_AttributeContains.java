package ExplicitWait_Examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_AttributeContains {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm"); // URL launch

		WebElement e1 = driver.findElement(By.className("mui-btn"));
		System.out.println(e1.getDomAttribute("value"));

		// explicit wait
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));

		// elementToBeClickable expected criteria
		Boolean until = wt.until(ExpectedConditions.attributeContains(By.xpath("//input"), "attribute_name", "attribute_value"));

		driver.close();
	}

}



/*
 * An expectation for checking WebElement with given locator has attribute which
 * contains specific value Parameters:locator used to define WebElement to check
 * its parameters attribute used to define css or html attribute value used as
 * expected attribute value Returns:Boolean true when element has css or html
 * attribute which contains the value
 */