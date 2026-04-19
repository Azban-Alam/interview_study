package Browser_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.wait(50000);
		
		driver.quit();

	}

}
