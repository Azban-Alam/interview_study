package ExplicitWait_Examples.Xpath;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_elementToBeSelected {
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
		boolean b = wt.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='val1'")));
		
		System.out.println("Element Is Selected If Boolean Value Is True"+b);
		
		driver.close();
	}
}