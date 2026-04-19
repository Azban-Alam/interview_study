package Dymanic_Element_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com"); // Replace with your actual URL

		// 1. child axis
		WebElement child = driver.findElement(By.xpath("//div[@id='section']/child::ul"));

		// 2. descendant axis
		WebElement descendant = driver.findElement(By.xpath("//div[@id='section']/descendant::a"));

		// 3. parent axis
		WebElement parent = driver.findElement(By.xpath("//a[@class='title']/parent::li"));

		// 4. ancestor axis
		WebElement ancestor = driver.findElement(By.xpath("//a[@class='title']/ancestor::div"));

		// 5. following axis
		WebElement following = driver.findElement(By.xpath("//h2/following::ul"));

		// 6. following-sibling axis
		WebElement followingSibling = driver.findElement(By.xpath("//li[1]/following-sibling::li"));

		// 7. preceding axis
		WebElement preceding = driver.findElement(By.xpath("//ul/preceding::h2"));

		// 8. preceding-sibling axis
		WebElement precedingSibling = driver.findElement(By.xpath("//li[3]/preceding-sibling::li"));

		// 9. self axis
		WebElement self = driver.findElement(By.xpath("//li[2]/self::li"));

		// 10. attribute axis (not commonly used this way in Selenium)
		WebElement attribute = driver.findElement(By.xpath("//a[@class='title']"));
		String classAttr = attribute.getDomAttribute("class");

		// 11. ancestor-or-self axis
		WebElement ancestorOrSelf = driver.findElement(By.xpath("//a[@class='title']/ancestor-or-self::a"));

		// 12. descendant-or-self axis
		WebElement descendantOrSelf = driver.findElement(By.xpath("//div[@id='section']/descendant-or-self::div"));

		// 13. namespace axis (not supported in HTML, mostly XML-specific)

		System.out.println("Class attribute: " + classAttr);
		driver.quit();
	}
}