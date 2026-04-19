package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Frames_in_Selenium_using_Index {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("URL");

		// First finding the element using any of locator strategy
		WebElement iframeElement = driver.findElement(By.id("iframeResult"));

		// now using the switch command
		driver.switchTo().frame(iframeElement);
		driver.quit();

		/*
		 * To move back to the parent frame, you can either use switchTo().parentFrame()
		 * or if you want to get back to the main window, you can use
		 * switchTo().defaultContent();
		 * 
		 * driver.switchTo().parentFrame(); // Parent Frame
		 * driver.switchTo().defaultContent();  ////Switch back to the main window
		 * 
		 * 
		 */

	}

}
