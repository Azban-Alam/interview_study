package EventDecorator.old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class EventDecoratorDemo {
	public static void main(String[] args) {
		
		// Set ChromeDriver path if needed
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		WebDriver originalDriver = new ChromeDriver(); // Original driver
		MyListener listener = new MyListener(); // Wrap with EventFiringDecorator
		WebDriver driver = new EventFiringDecorator<>(listener).decorate(originalDriver);

		try {
			
			driver.get("https://www.selenium.dev/");
			WebElement downloadsLink = driver.findElement(By.linkText("Downloads"));
			downloadsLink.click();
			String heading = driver.findElement(By.tagName("h1")).getText();
			System.out.println("Page heading: " + heading);

		} catch (Exception e) {
			System.out.println("Caught exception in test: " + e.getMessage());
		} finally {
			driver.quit();
		}
	}
}
