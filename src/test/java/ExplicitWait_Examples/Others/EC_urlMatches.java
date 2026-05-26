package ExplicitWait_Examples.Others;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_urlMatches {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			String regex = "\\b(https?|ftp|file):/​/​[-a-zA-Z0-9+&@#/​%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/​%=~_|]";
			Boolean urlMatches = wait.until(ExpectedConditions.urlMatches(regex));
			System.out.println("Boolean is TRUE id title matches" + urlMatches);
		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}
}


/*
 * Expectation for the URL to match a specific regular expression
 * Parameters:regex the regular expression that the URL should match
 * Returns:true if the URL matches the specified regular expression
 */