package JS_Scroll_Down_And_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Click_On_Element {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Launch the application
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

		WebElement element = driver.findElement(By.xpath("//input"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

		// Scenario #2: To Click on a Button
		js.executeScript("document.getElementById('enter your element id').click();");
		// or
		js.executeScript("arguments[0].click();", element);

	}
}
