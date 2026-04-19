package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Method_getLocation_of_WebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		// Min slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));

		Point location = min_slider.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		System.out.println(x +"----"+y);
	}

}
