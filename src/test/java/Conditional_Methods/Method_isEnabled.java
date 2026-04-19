package Conditional_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_isEnabled {

	public static void main(String[] args) {
		// Set up WebDriver (assuming ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://www.example.com"); // Replace with a relevant URL

        // Find an element (e.g., a button)
        WebElement submitButton = driver.findElement(By.id("submitButton")); // Replace with actual locator

        // Check if the button is enabled
        boolean isButtonEnabled = submitButton.isEnabled();

        if (isButtonEnabled) {
            System.out.println("The submit button is enabled.");
            submitButton.click(); // Perform action if enabled
        } else {
            System.out.println("The submit button is disabled.");
        }

        driver.quit();

	}

}
