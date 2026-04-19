package Keyboard_Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions_keyDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT);
		a.sendKeys("a");
		a.keyUp(Keys.SHIFT);
		a.sendKeys("b");
		a.perform();
	}

}
