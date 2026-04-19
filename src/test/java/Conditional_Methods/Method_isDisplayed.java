package Conditional_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_isDisplayed {

	public static void main(String[] args) {
		// Set up WebDriver (assuming ChromeDriver is in your PATH)
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.example.com"); // Replace with your URL

		// Find an element
		WebElement element = driver.findElement(By.id("someElementId"));

		// Check if the element is displayed
		boolean isVisible = element.isDisplayed();

		if (isVisible) {
			System.out.println("The element is displayed.");
			// Perform actions on the element
			element.click();
		} else {
			System.out.println("The element is not displayed.");
		}

		driver.quit();

	}

}
