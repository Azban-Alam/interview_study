package Browser_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Manage_SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);

		// new Point (xOffset, yOffset);
		Point newPoint = new Point(100, 300);
		driver.manage().window().setPosition(newPoint);

		driver.close();

	}

}
