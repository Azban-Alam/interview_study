package ExplicitWait_Examples.Others;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_titleContains {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			boolean b = wait.until(ExpectedConditions.titleContains("oo"));
			System.out.println("Boolean is TRUE id title matches" + b);
		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}
}

/*
 * Open Declaration ExpectedCondition <Boolean>
 * org.openqa.selenium.support.ui.ExpectedConditions.titleContains (String title )
 * 
 * An expectation for checking that the title contains a case-sensitive
 * substring Parameters:fragment of title expected. Returns:true when
 * the title matches, false otherwise
 */