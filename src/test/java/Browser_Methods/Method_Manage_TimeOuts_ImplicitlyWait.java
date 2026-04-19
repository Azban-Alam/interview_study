package Browser_Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Manage_TimeOuts_ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);

		// Implicit wait timeout for 20seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.close();

	}

}
