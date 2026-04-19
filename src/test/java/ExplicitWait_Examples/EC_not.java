package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_not {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean element = wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.name("q"))));
	}
}


/* 
 * An expectation with the logical opposite condition of the given condition.
 * 
 * Note that if the Condition you are inverting throws an exception that is
 * caught by theIgnored Exceptions, the inversion will not take place and lead
 * to confusing results. Parameters:condition ExpectedCondition to be
 * invertedReturns:true once the condition is satisfied
 */