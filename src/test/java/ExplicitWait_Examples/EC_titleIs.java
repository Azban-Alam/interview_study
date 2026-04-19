package ExplicitWait_Examples;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EC_titleIs {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			boolean b = wait.until(ExpectedConditions.titleIs("google"));

			System.out.println("Boolean is TRUE id title matches" + b);

		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}
}

/*
 * Open Declaration ExpectedCondition <Boolean>
 * org.openqa.selenium.support.ui.ExpectedConditions.titleIs ( String title )
 * 
 * An expectation for checking the title of a page. Parameters:expected title,
 * which must be an exact match. Returns:true when the title
 * matches, false otherwise
 */