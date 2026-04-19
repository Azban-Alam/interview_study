package Browser_Methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Navigate_To_Forward {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();

		driver.navigate().to("https://www.tutorialspoint.com/index.htm");
		Thread.sleep(5000);
		System.out.println("Current Url : " + driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println("Back Ward  :" + driver.getCurrentUrl());

		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("Forward :" + driver.getCurrentUrl());

		driver.quit();

	}

}
