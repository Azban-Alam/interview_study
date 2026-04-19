package SSL_Certificate_Handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IgnoreCertificateErrors {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("start-maximized");
        options.addArguments("--headless=new");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");



		WebDriver driver = new ChromeDriver(options);
		driver.get("https://your-ssl-site.com");
	}

}
