package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./path.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
	}

}
