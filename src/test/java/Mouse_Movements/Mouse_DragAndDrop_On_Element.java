package Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_DragAndDrop_On_Element {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));

		Actions a = new Actions(driver);
		a.dragAndDrop(draggable, droppable);
		a.build();
		a.perform();

		// Another Code

		a.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
	}

}
