package JS_Scroll_Down_And_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_to_scroll_down_to_an_element_in_Selenium_until_it_is_visible {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

		// Locating element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));

		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}
}
