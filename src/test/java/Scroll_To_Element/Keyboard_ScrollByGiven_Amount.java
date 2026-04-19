package Scroll_To_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_ScrollByGiven_Amount {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebElement element = driver.findElement(By.xpath("//input[@id='name'"));
		int y = element.getRect().y;

		Actions a = new Actions(driver);
		a.scrollByAmount(0, y);
		a.build();
		a.perform();

	}
}
