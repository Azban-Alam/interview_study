package JS_Scroll_Down_And_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Alert {
	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("URL");
		
		// Generate an alert after login using JavaScript
		String alertMessage = "Login successful!";

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('hello world');");

		// Switch to the alert window and accept it
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
