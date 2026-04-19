package Handling_DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClickActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bstackdemo.com/");

		// Click On Drop-Down
		driver.findElement(By.xpath("//select")).click();

		String option = "Highest to lowest";

		// Click On The Element
		WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));
		dropdown.click();

	}

}
