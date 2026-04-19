package Handling_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByUsingActionsClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		WebElement dd = driver
				.findElement(By.xpath("//span[@class='nav_item_name' and contains(text(), 'Developers')]"));

		Actions action = new Actions(driver);
		action.moveToElement(dd).click(dd).perform();
		String option = "Support";
		WebElement customOption = driver
				.findElement(By.xpath("//li[@class='developers-menu-control']/a[contains(text(), '" + option + "')]"));
		customOption.click();
	}

}
