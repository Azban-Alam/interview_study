package Different_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Xpath With Single Attribute
		WebElement e1 = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

		// Xpath With Multiple Attributes
		WebElement e2 = driver.findElement(By.xpath("//input[@id='small-searchterms'][name='q']"));

		driver.quit();
	}

}
