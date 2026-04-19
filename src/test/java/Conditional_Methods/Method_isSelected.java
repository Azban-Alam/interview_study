package Conditional_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_isSelected {

	public static void main(String[] args) {

		// Set the path to your ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com/your-page-with-checkboxes"); // Replace with your URL

		// Locate a checkbox element
		WebElement checkbox = driver.findElement(By.id("myCheckbox"));

		// Check if the checkbox is selected
		if (checkbox.isSelected()) {
			System.out.println("Checkbox is currently selected.");
		} else {
			System.out.println("Checkbox is not currently selected.");
			// You can click it to select it if needed
			checkbox.click();
			if (checkbox.isSelected()) {
				System.out.println("Checkbox is now selected.");
			}
		}

		// Locate a radio button element
		WebElement radioButton = driver.findElement(By.id("myRadioButton"));

		// Check if the radio button is selected
		if (radioButton.isSelected()) {
			System.out.println("Radio button is currently selected.");
		} else {
			System.out.println("Radio button is not currently selected.");
		}

		driver.quit();

	}

}
