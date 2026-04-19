package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_to_find_the_number_of_frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https:// url containing i-frames/");

		// By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
		System.out.println("Total number of iframes are " + iframeElements.size());

		// By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("No. of iframes on the page are " + noOfFrames);

	}

}
