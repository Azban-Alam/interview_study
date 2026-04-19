package Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions_sendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions a = new Actions(driver);
		a.sendKeys("abc");
		a.perform();
 
		
		// Designated Element
		
		WebElement textField = driver.findElement(By.xpath(""));
		Actions b = new Actions(driver);
		b.sendKeys(textField, "Selenium!");
		b.perform();
		
		
	}

}
