package ExplicitWait_Examples.Elements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_domPropertyToBe {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/index.htm"); // URL launch
		
		WebElement e1 = driver.findElement(By.className("mui-btn"));
		System.out.println(e1.getDomProperty("value"));

		// explicit wait
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));

		// elementToBeClickable expected criteria
		Boolean until = wt.until(ExpectedConditions.domPropertyToBe(e1, "property_name", "property_value"));

		driver.close();
	}

}

/*
 * An expectation for checking given WebElement has DOM property with a specific
 * value Parameters:element used to check its parameters property property
 * name value used as expected property value Returns:Boolean true when element
 * has DOM property with the value
 */
