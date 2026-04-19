package Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_ContextClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebElement clickable = driver.findElement(By.id("clickable"));
		Actions a1 = new Actions(driver);
		a1.contextClick(clickable);   // Right Click Of Mouse
		a1.build();
		a1.perform();
	}

}
