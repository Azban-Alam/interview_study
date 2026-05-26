package ExplicitWait_Examples.Others;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_alertIsPresent_imp {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Alert until = wait.until(ExpectedConditions.alertIsPresent());
			
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert box text " + alert.getText());
			alert.accept();

		} catch (NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
	}
}