package JS_Scroll_Down_And_Up;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_To_End_Of_Web_Page {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Launch the application
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

		// to perform scroll on an application using Selenium

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// Output: The code above will fetch the maximum height of the webpage from the
		// Document Object Model, and then the scrollBy() method scrolls down to the
		// bottom.

	}
}
  